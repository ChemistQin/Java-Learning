package Strings;

public class IntegerMatch {
	public static void main(String[] args) {
		// -?\\d+  possibly a minus sign, followed by one or more digits.
		// (-|\\+)? means that this part of the string may be either a ‘-’ or 
		// a ‘+’ or nothing (because of the ‘?’). 
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("1234".matches("-?\\d+"));
		System.out.println("+1234".matches("-?\\d+"));
		System.out.println("+1234".matches("(-|\\+)?\\d+"));
		
	}

}
