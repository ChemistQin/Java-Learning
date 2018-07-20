package network;

import java.net.*;

public class UDPReceive {
	public static void main(String[] args) throws Exception {
		System.out.println("接收端启动");
		DatagramSocket dSocket = new DatagramSocket(10000);
		byte[] buf = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
		dSocket.receive(dPacket);
		String ip = dPacket.getAddress().getHostAddress();
		int port = dPacket.getPort();
		String text = new String(dPacket.getData(), 0 ,dPacket.getLength());
		System.out.println(ip + ": " + port +": " + text);
		dSocket.close();
	}
}
