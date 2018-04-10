package C9;

abstract class BaseIncludePrint {
	public BaseIncludePrint() {
		print();
	}
	public abstract void print();
}

class IntPrint extends BaseIncludePrint {
	int i = 22;
	public void print() {
		System.out.println("i = " + i);
	} 
}

public class C9E3 {
	public static void main(String[] args) {
		IntPrint ip = new IntPrint();
//		ip.print();
	}
}