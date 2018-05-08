package C10;

public interface ClassInterface {
	void foo();
	class Test implements ClassInterface {
		public void foo() {
			System.out.println("naive");
		}
		public static void main(String[] args) {
			new Test().foo();
		}
	}
}