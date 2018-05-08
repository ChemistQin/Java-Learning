package C9;

abstract class NoMathods {}

class Class1 extends NoMathods {
	public void f() {
		System.out.println("Class1.f()");
	}
}

public class NoMathodsAbstractClass {
	public static void g(NoMathods a) {
		((Class1)a).f();
	}
	public static void main(String[] args) {
		NoMathods a = new Class1();
		g(a);
	}
}