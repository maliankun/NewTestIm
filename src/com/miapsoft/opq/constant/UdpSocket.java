package com.miapsoft.opq.constant;

import java.net.DatagramSocket;
import java.net.SocketException;
/**
 * 
 * @author liyakun
 * 2014Äê12ÔÂ2ÈÕ
 */
public class UdpSocket {
	
	private static DatagramSocket socket =null ;

	public static final DatagramSocket socketinfo() throws SocketException{
		if (socket==null)
		socket=new DatagramSocket();
		return socket;
	}
	
	

}
