package com.miapsoft.opq.thread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import android.util.Log;

import com.miapsoft.opq.proto.Base.BaseProto;
/**
 * 
 * @author liyakun
 * 2014��11��21��
 * ���������������Ϣ���߳�
 * ��������ַ��192.168.1.133;
 * ���Ե�ַ    ��192.168.1.112
 * 
 */
public class SendThread extends Thread{
	DatagramSocket socket;
	BaseProto.Builder bB=null;
	
	public SendThread(DatagramSocket socket,BaseProto.Builder bB){
	    this.socket=socket;
	    this.bB=bB;
	}
		public void run() {
			byte[] bytes=bB.build().toByteArray();
			try {
				DatagramPacket sPacket = new DatagramPacket(bytes, bytes.length,
						InetAddress.getByName("192.168.1.133"), 52100);
				socket.send(sPacket);
				Log.v("111111", "aaaaaaa");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

}
