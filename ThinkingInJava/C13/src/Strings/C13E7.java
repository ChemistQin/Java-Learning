package Strings;


/****************** Exercise 7 ******************
 * Using the documentation for java.util.regex.Pattern
 * as a resource, write and test a regular expression
 * that checks a sentence to see that it begins with a
 * capital letter and ends with a period.
 ************************************************/

public class C13E7 {
	public static boolean matches(String s) {
		return s.matches("\\p{javaUpperCase}.*\\.");
	}
	public static void main(String[] args) {
		System.out.println(matches("too youung, too simple."));
		System.out.println(matches("naive!"));
	}
}
