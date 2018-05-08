package TypeInfo;

import java.util.Random;

class Initable {
	static final int i1 = 23;
	static {
		System.out.println("类初始化");
	}
}

public class ClassInitizlization {
	public static Random random  = new Random();
	public static void main(String[] args) {
		Class initable = Initable.class;
		System.out.println("after creating Initable ref.");
		System.out.println(Initable.i1);
	}
}
