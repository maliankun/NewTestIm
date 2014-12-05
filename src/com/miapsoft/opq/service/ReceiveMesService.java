package com.miapsoft.opq.service;

import java.net.DatagramSocket;
import java.net.SocketException;

import com.miapsoft.opq.constant.Constants;
import com.miapsoft.opq.constant.UdpSocket;
import com.miapsoft.opq.main.MessageListener;
import com.miapsoft.opq.proto.Base.BaseProto;
import com.miapsoft.opq.thread.UdpThread;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/**
 * 
 * @author Administrator
 * 接收消息的service
 */
public class ReceiveMesService  extends Service{
	
	static DatagramSocket socket;

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		try {
			socket=UdpSocket.socketinfo();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UdpThread  re_msg_thread = new UdpThread(socket);
		re_msg_thread.start();
		re_msg_thread.setMessageListener(new MessageListener() {
			
			@Override
			public void Message(BaseProto msg) {
				Intent broadCast = new Intent();
				broadCast.setAction(Constants.MSGACTION);
				broadCast.putExtra(Constants.MSGINFO, msg);
				sendBroadcast(broadCast);// 把收到的消息已广播的形式发送出去
				
			}
		});
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	
	
	

}
