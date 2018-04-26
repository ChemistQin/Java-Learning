package Exceptions;

class SimpleException extends Exception {}



public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("throw simple exception from f()");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		}	catch (SimpleException e) {
			// TODO: handle exception
			System.out.println("catch it!");
		}
	}
}