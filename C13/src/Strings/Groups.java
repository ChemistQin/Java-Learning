package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	static public final String POEM = "Give me your tired, your poor,\n" + 
			"Your huddled masses yearning to breathe free,\n" + 
			"The wretched refuse of your teeming shore.\n" + 
			"Send these, the homeless, tempest-tossed to me,\n" + 
			"I lift my lamp beside the golden door!";
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
				.matcher(POEM);
		while(matcher.find() ) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println("[" + matcher.group(i) + "]");
			}
		}
	}
}
