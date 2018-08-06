package containers;

import java.util.LinkedHashSet;
import java.util.Set;

import arrays.Generator;

class Government implements Generator<String> {
	String[] foundation = ("The whole earth is the tomb of heroic men "
			+ "and their story is not given only on stone over their clay "
			+ "but abides everywhere without visible symbol woven "
			+ "into the stuff of other men's lives.").split(" ");
	private int index;
	@Override
	public String next() {
		return foundation[index++];
	}
}

public class CollectionDataTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 12));
		set.addAll(CollectionData.list(new Government(), 12));
		System.out.println(set);
	}
}
