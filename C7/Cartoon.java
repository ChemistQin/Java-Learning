//
package C7;

class Art {
	Art() {
		System.out.println("Art Constructor");  //构造器 初始化后打印
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing Constructor");
	}
}

public class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon Constructor");
	}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}