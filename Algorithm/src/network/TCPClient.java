package network;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//create client socket.
		Socket socket = new Socket("192.168.1.102", 10086);
		//get output stream from socket stream.
		OutputStream outputStream = socket.getOutputStream();
		//use output stream to write data 
		outputStream.write("TCP Test".getBytes());
		
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int len = inputStream.read(buf);
		String text = new String(buf, 0, len);
		
		System.out.println(text);
		
		//close socket
		socket.close();
	}
}
