package algorithm;

public class MyException extends Exception {
	String message;
	public MyException(int number) {
		message = "number cannot be positive";
	}
	public String toString() {
		return message;
	}
	
	public static void main(String[] args) {
		int n = -6;
		try {
			TestNumber testNumber = new TestNumber();
			testNumber.numberTest(n);
		} catch (MyException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally.");
		}
	}
}

class TestNumber {
	public void numberTest(int n) throws MyException {
		if (n < 0) {
			MyException exception = new MyException(n);
			throw exception;
		}
		if (n >= 0) {
			System.out.println("n >= 0");
		}
	}
	

}

