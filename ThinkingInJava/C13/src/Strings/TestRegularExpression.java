package Strings;
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(ABC){2,}" } 
// right-click TestRegularExpression.java file, choose run as, input arguments, run.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("usage:\njava TestRegularExpression " + 
					"characterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("input: \"" + args[0] + "\"");
		for (String string : args) {
			System.out.println("regular expression: \"" + string + "\"");
			Pattern pattern = Pattern.compile(string);
			Matcher matcher = pattern.matcher(args[0]);
			while(matcher.find()) {
				System.out.println("match \"" + matcher.group() + "\" at positions " + matcher.start() +
						"-" + (matcher.end() - 1));
			}
		}
	}
}
