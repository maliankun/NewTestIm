package com.miapsoft.opq;


import com.miapsoft.opq.constant.Constants;
import com.miapsoft.opq.proto.Base.BaseProto;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/**
 * 
 * @author Administrator
 * 基本的activity，每个应用activity都继承它，实现消息的接收。
 */
public abstract class BaseActivity extends Activity{
	/**
	 * 广播接收者，用来接收消息
	 */
	private BroadcastReceiver msg_receiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			BaseProto msg = (BaseProto) intent.getSerializableExtra(Constants.MSGINFO);
			dealmessage(msg);
		}
		
	};
	
	/**
	 * 用来处理消息的方法
	 * @param msg
	 */
	public abstract void dealmessage(BaseProto msg);

	/**
	 * 注册接收消息的广播
	 */
	@Override
	protected void onStart() {
		super.onStart();
		IntentFilter intentfilter = new IntentFilter();
		intentfilter.addAction(Constants.MSGACTION);
		registerReceiver(msg_receiver, intentfilter);
		
	}
	
	
	
	
	
}
