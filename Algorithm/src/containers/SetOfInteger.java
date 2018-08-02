package containers;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
	public static void main(String[] args) {
		Random random = new Random(46);
		Set<Integer> integers = new HashSet<Integer>();
		for (int i = 0; i < 666; i++) {
			integers.add(random.nextInt(33));
		}
		System.out.println(integers);
	}
}
