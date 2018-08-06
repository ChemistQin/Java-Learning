package containers;

import java.util.*;



public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Quantum")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("Physics"));
		System.out.println(list);
	}
}
