package arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	private static Random random = new Random(14);
	static final String[] FLAVORS = {"Chocolate", "Strawberry", "Vanilla", "Green Bean"};
	
	public static String[] flavorSet(int n) {
		if (n > FLAVORS.length) {
			throw new IllegalArgumentException("Set too big");
		}
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		
		for (int i = 0; i < n; i++) {
			int t;
			do {
				t = random.nextInt(FLAVORS.length);
			} while (picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
		}
		return results;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(flavorSet(4)));
		}
	}
}
