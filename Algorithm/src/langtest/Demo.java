package langtest;

public class Demo {
	public static void main(String[] args) {
		double x = 1067169.08;
		for (int i = 0; i < 10; i++) {
			System.out.println(x * (1 + 0.01 * i));
		}
	}
}
