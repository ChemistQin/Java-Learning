package C10.E23;
interface U {
	void f();
	void g();
	void h();
}

class A {
	public U returnU() {
		return new U() { //匿名类
			public void f() {
				System.out.println("A.f()");
			}
			public void g() {
				System.out.println("A.g()");
			}
			public void h() {
				System.out.println("A.h()");
			}
		};
	}
}

class B {
	U[] arrU;
	public B(int size) {
		arrU = new U[size];
	}
	public boolean add(U elem) {
		for(int i = 0; i < arrU.length; i++) {
			if(arrU[i] == null) {
				arrU[i] = elem;
				return true;
			}
		}
		return false;
	}
	public boolean setNull(int i) {
		if(i < 0 || i >= arrU.length)
			arrU[i] = null;
		return true;
	}
	public void callMethod() {
		for (int i = 0; i < arrU.length; i++ ) {
			if(arrU[i] != null) {
				arrU[i].f();
				arrU[i].g();
				arrU[i].h();			} 
		}
	}
}

public class UAB {
	public static void main(String[] args) {
		A[] arrA = {new A(), new A(), new A()};
		B b = new B(3);
		for(int i = 0; i < arrA.length; i++)
			b.add(arrA[i].returnU());
		b.callMethod();
		System.out.println("\n");
		b.setNull(0);
	}
}

