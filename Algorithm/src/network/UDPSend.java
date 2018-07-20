package network;

import java.io.IOException;
import java.net.*;

public class UDPSend {
	public static void main(String[] args) throws Exception {
		DatagramSocket dSocket = new DatagramSocket();
		String text = "hello world";
		byte[] buf = text.getBytes();
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.102"), 12345);
		dSocket.send(dPacket);
		dSocket.close();
	}
	
}
