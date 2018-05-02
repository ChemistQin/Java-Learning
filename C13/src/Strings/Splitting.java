package Strings;

import java.util.Arrays;

public class Splitting {
	public static String knights = "Give me your tired, your poor,\n" + 
			"Your huddled masses yearning to breathe free,\n" + 
			"The wretched refuse of your teeming shore.\n" + 
			"Send these, the homeless, tempest-tossed to me,\n" + 
			"I lift my lamp beside the golden door!";
			//Statue of Liberty.
	public static void split(String regex) {
		System.out.println(
				Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}
}
