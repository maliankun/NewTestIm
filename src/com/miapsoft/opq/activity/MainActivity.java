package com.miapsoft.opq.activity;

import java.net.DatagramSocket;
import java.net.SocketException;

import com.example.newtestim.R;
import com.google.protobuf.InvalidProtocolBufferException;
import com.miapsoft.opq.BaseActivity;
import com.miapsoft.opq.constant.ProtoType;
import com.miapsoft.opq.constant.UdpSocket;
import com.miapsoft.opq.proto.Base.BaseProto;
import com.miapsoft.opq.proto.Login.LoginProto;
import com.miapsoft.opq.proto.UserInfo.UserInfoProto;
import com.miapsoft.opq.service.ReceiveMesService;
import com.miapsoft.opq.thread.SendThread;
import com.miapsoft.opq.util.Preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 登录的测试类
 * 
 * @author liyakun 2014年11月21日
 */
public class MainActivity extends BaseActivity implements OnClickListener {

	private static final String TAG = "LoginActivity";
	private EditText et_username;
	private EditText et_userpwd;
	private Button bt_login;
	private Button bt_cancel;
	private Button bt_registered;

	static DatagramSocket socket;
	public static Handler newhandler;

	String userId, userName, headerImg, userSex, position, address, motto,
			email, phone;
	Thread re_thread1;
	Context context;
	BaseProto bp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = MainActivity.this;
		setContentView(R.layout.login);
		InitObj();
		startmsgservice();
	}

	public void InitObj() {
		et_username = (EditText) findViewById(R.id.et_username);
		et_userpwd = (EditText) findViewById(R.id.et_userpwd);
		bt_login = (Button) findViewById(R.id.bt_login);
		bt_cancel = (Button) findViewById(R.id.bt_cancel);
		bt_registered = (Button) findViewById(R.id.bt_registered);

		bt_login.setOnClickListener(this);
		bt_cancel.setOnClickListener(this);
		bt_registered.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_login:
			String username = et_username.getText().toString();
			String userpwd = et_userpwd.getText().toString();
			BaseProto.Builder bB = BaseProto.newBuilder();
			bB.setType(ProtoType.LOGIN);
			LoginProto.Builder lB = LoginProto.newBuilder();
			// lB.setId("12458652");
			// lB.setPwd("4455555");
			lB.setId(username);
			lB.setPwd(userpwd);
			bB.setItem(lB.build().toByteString());
			/** 发送消息的线程 **/
			try {
				socket = UdpSocket.socketinfo();
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread send = new SendThread(socket, bB);
			send.start();

			break;
		case R.id.bt_cancel:

			break;
		case R.id.bt_registered:
			/*Intent intent = new Intent(context, RegisteredActivity.class);
			startActivity(intent);*/
			break;

		default:
			break;
		}
	}
	/**接收消息的服务**/
	public void startmsgservice(){
		Intent service = new Intent(MainActivity.this,ReceiveMesService.class);
	    startService(service);
	}

	
	/**处理分发的消息**/
	@Override
	public void dealmessage(BaseProto msg) {
		bp = (BaseProto) msg;
		switch (bp.getType()) {
		/** 登录 **/
		case ProtoType.LOGIN:

			String item = bp.getItem().toStringUtf8();
			try {
				if ("".equals(item)) {
					Toast.makeText(context, "用户名或密码错误!", Toast.LENGTH_SHORT)
							.show();
				} else {
					UserInfoProto uiP = UserInfoProto.parseFrom(bp
							.getItem());
					// String name = bp.getType();
					userId = uiP.getId();
					userName = uiP.getName().toStringUtf8();
					headerImg = uiP.getHeaderImg().toStringUtf8();
					int sex = uiP.getSex();
					userSex = "";
					if (sex == 0) {
						userSex = "男";
					} else {
						userSex = "女";
					}
					position = uiP.getPosition().toStringUtf8();
					address = uiP.getAddress().toStringUtf8();
					motto = uiP.getMotto().toStringUtf8();
					email = uiP.getEmail();
					phone = uiP.getPhone();
					Preference.SetPreference(context, "userId", userId);
					Preference.SetPreference(context, "userName", userName);
					Preference.SetPreference(context, "headerImg",
							headerImg);
					Preference.SetPreference(context, "userSex", userSex);
					Preference.SetPreference(context, "position", position);
					Preference.SetPreference(context, "address", address);
					Preference.SetPreference(context, "motto", motto);
					Preference.SetPreference(context, "email", email);
					Preference.SetPreference(context, "phone", phone);
					Toast.makeText(context, "登陆成功", Toast.LENGTH_SHORT)
							.show();
				}

			} catch (InvalidProtocolBufferException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		default:
			break;
		}		
	}



}
