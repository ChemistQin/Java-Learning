package algorithm;

public class TestDriver {
	public static void main(String[] args) {
		Complex complex1 = new Complex(1, 1);
		Complex complex2 = new Complex(3, 1);
		
		Complex addResult = complex1.add(complex2);
		Complex subResult = complex1.sub(complex2);
		Complex mulResult = complex1.mul(complex2);
		Complex divResult = complex1.div(complex2);
		addResult.show();
		subResult.show();
		mulResult.show();
		divResult.show();
	}
}
