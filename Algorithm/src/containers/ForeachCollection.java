package containers;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCollection {
	public static void main(String[] args) {
		Collection<String> cStrings = new LinkedList<String>();
		Collections.addAll(cStrings, "too young too simple".split(" "));
		for (String string : cStrings) {
			System.out.println(string);
		}
	}
}
