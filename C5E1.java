/****************** Exercise 01 ****************
 * Create a class with an uninitialized
 * String reference. Demonstrate that this
 * reference is initialized by Java to null.
 ***********************************************/
public class C5E1 {
	String s;
	public static void main(String[] args) {
		C5E1 sstr = new C5E1();
		System.out.println("sstr.s = " + sstr.s);
	}
}
//未初始化，output:sstr.s = null