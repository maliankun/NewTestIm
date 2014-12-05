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
 * ������activity��ÿ��Ӧ��activity���̳�����ʵ����Ϣ�Ľ��ա�
 */
public abstract class BaseActivity extends Activity{
	/**
	 * �㲥�����ߣ�����������Ϣ
	 */
	private BroadcastReceiver msg_receiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			BaseProto msg = (BaseProto) intent.getSerializableExtra(Constants.MSGINFO);
			dealmessage(msg);
		}
		
	};
	
	/**
	 * ����������Ϣ�ķ���
	 * @param msg
	 */
	public abstract void dealmessage(BaseProto msg);

	/**
	 * ע�������Ϣ�Ĺ㲥
	 */
	@Override
	protected void onStart() {
		super.onStart();
		IntentFilter intentfilter = new IntentFilter();
		intentfilter.addAction(Constants.MSGACTION);
		registerReceiver(msg_receiver, intentfilter);
		
	}
	
	
	
	
	
}
