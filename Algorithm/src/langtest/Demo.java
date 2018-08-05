package langtest;

public class Demo {
	public static void main(String[] args) {
		final double X = 1067169.08;
		for (int i = 0; i < 10; i++) {
			System.out.println(X * (1 + 0.01 * i));
		}
	}
}
