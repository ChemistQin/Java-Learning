package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class UDPSend {
	public static void main(String[] args) throws Exception {
		DatagramSocket dSocket = new DatagramSocket();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			byte[] buf = line.getBytes();
			DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10000);
			dSocket.send(dPacket);
			if ("end".equals(line)) {
				break;
			}
		}		
		//String text = "苟利国家生死以 岂因祸福避趋之";

		dSocket.close();
	}
	
}
