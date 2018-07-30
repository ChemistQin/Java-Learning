package generics;


public class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}
	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		TwoTuple tuple = new TwoTuple(a, b);
		System.out.println(tuple.toString());
	}
}
