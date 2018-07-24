package langtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input:\n-----PRESS 'Q' TO QUIT-----");
		char c;
		do {
			c = (char) bufferedReader.read();
			System.out.println(c);
		} while (c != 'Q');
	}
}
