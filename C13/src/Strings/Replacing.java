package Strings;

public class Replacing {
	static String string = Splitting.knights;
	public static void main(String[] args) {
		System.out.println(string.replaceFirst("y\\w+", "located"));
		System.out.println(string.replaceAll("your", "你的"));

	}
}
