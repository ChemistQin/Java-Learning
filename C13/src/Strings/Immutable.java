package Strings;

public class Immutable {
	public static String upcase(String s) {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "naive";
		System.out.println(q);
		String q2 = upcase(q);
		System.out.println(q);
		System.out.println(q2);
		

	}

}
