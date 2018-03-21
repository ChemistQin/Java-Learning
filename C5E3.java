
/* C5E3  
         Create a class with a default constructor (one
         that takes no arguments) that prints a
         message. Create an object of this class.
public class C5E3 {
	C5E3() {
		System.out.println("+1s");
	}
	public static void main(String[] args) {
		new C5E3();
	}
}
*/

/* C5E4   
         Add an overloaded constructor to Exercise 3 that
         takes a String argument and prints it along with
         your message.
 */
public class C5E3 {
	C5E3() {
		System.out.println("+1s");
	}
	C5E3(String s) {
		System.out.println(s);
		System.out.println("+1s");
	}
	public static void main(String[] args) {
		new C5E3();
		new C5E3("Zhangzhe");
	}
}