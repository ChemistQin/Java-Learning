package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(10086);
		Socket socket = serverSocket.accept();
		String ip = socket.getInetAddress().getHostAddress();
		InputStream inputStreamReader = socket.getInputStream();
		byte[] buf = new byte[1024];
		int len = inputStreamReader.read(buf);
		String text = new String(buf, 0, len);
		System.out.println(ip + ": " + text);
		socket.close();
		serverSocket.close();
	}
}
