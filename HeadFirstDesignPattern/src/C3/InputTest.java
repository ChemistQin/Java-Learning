package C3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream inputStream = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("test.txt")));
			//file test.txt should be in contained within the root of the project,
			//so we put it in HeadFirstDesignPattern directory.
			while ((c = inputStream.read()) >= 0)  {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
