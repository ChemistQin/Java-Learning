package Exceptions;

class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}

public class FullConstructor {
	public static void f() throws MyException {
		System.out.println("throw MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException {
		System.out.println("throw MyException from g()");
		throw new MyException("Originated in g()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		}catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		try {
			g();
		}catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}

	}

}
