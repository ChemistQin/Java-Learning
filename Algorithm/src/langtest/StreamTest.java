package langtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Qinsiping
 * I/O Stream ----> ByteStream ----> Reader ----> BufferedReader
 * 											----> InputStreamReader ----> FileReader
 * 											----> StringReader
 * 											----> PipedReader
 * 											----> CharArrayReader
 * 											----> FilterReader ----> PushbackReader 
 * 									 
 * 									 Writer ----> BufferedWriter 
 * 											----> OutputStreamWriter ----> FileWriter
 * 											----> PrinterWriter			
 * 											----> StringWriter	
 * 											----> PipedWriter	
 * 											----> CharArrayWriter	
 * 											----> FilterWriter		
 * 										
 *            ----> CharStream ----> InputStream ----> FileInputStream
 *            									 ----> FilterInputStream ----> BufferedInputStream
 *            															 ----> DataInputStream
 *            															 ----> PushbackInputStream
 *             									 ----> ObjectInputStream
 *            									 ----> PipedInputStream
 *             									 ----> SequenceInputStream
 *              								 ----> StringBufferInputStream
 *               								 ----> ByteArrayInputStream
 *           
 *            				  ----> OutputStream ----> FileOutputStream  
 *               								 ----> FilterOutputStream ----> BufferedOutputStream
 *            															  ----> DataOutputStream
 *            															  ----> PrintStream
 *               								 ----> ObjectOutputStream
 *               								 ----> PipedOutputStream
 *               								 ----> ByteArrayOutputStream                                                                 
 * 
 */

public class StreamTest {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----PRESS 'Q' TO QUIT-----\nInput:");
		char c;
		do {
			c = (char) bufferedReader.read();
			System.out.println(c);
		} while (c != 'Q');
	}
}
