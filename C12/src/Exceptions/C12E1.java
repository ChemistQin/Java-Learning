package Exceptions;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class C12E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("an exception in main");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("e.getMsg() = " + e.getMessage());
		} finally {
			System.out.println("in finally clause");
		}

	}

}
