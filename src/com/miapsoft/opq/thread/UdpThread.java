package com.miapsoft.opq.thread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.miapsoft.opq.main.MessageListener;
import com.miapsoft.opq.proto.Base.BaseProto;
import com.miapsoft.opq.proto.UserInfo.UserInfoProto;

/**
 * 
 * @author liyakun 2014年11月21日 这个是用来接收消息的线程
 */
public class UdpThread extends  Thread {

	static DatagramSocket socket;
	Handler handler;
	Message msg;
	int type;
	static UdpThread instance;
	private MessageListener messageListener;// 消息监听接口对象

	public UdpThread(DatagramSocket socket) {
		this.socket = socket;
	}
	
	
	
	
	/**
	 * 提供给外部的消息监听方法
	 * 
	 * @param messageListener
	 *            消息监听接口对象
	 */
	public void setMessageListener(MessageListener messageListener) {
		this.messageListener = messageListener;
	}

	/** 单例模式 **/
	/*
	 * private UdpThread(){ try { socket = new DatagramSocket(); } catch
	 * (SocketException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static synchronized UdpThread getInstance(){ if(instance==null){
	 * synchronized(UdpThread.class){ instance=new UdpThread();
	 * 
	 * } } return instance; }
	 */

	@Override
	public void run() {
		while (true) {
			try {
				byte[] receiveByte = new byte[1024 * 60];
				DatagramPacket packet = new DatagramPacket(receiveByte,
						receiveByte.length);
				Log.v("receivetag", "isreceived0");
				socket.receive(packet);

				byte[] receiveData = new byte[packet.getLength()];

				for (int i = 0; i < receiveData.length; i++) {
					receiveData[i] = receiveByte[i];
				}

				Log.v("receivetag", "isreceived");

				BaseProto bp = BaseProto.parseFrom(receiveData);
				messageListener.Message(bp);
               
			} catch (IOException e) {
				System.out.print(e.getMessage());
			}
		}
	}

	
}
