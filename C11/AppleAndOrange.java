package C11;
import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter;
	public long getId() {
		return id;
	}
}

class Orange {}

public class AppleAndOrange {
	//@SuppressWarning("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 5; i++)
			apples.add(new Apple());
		for(int i = 0; i < apples.size(); i++)
			((Apple)apples.get(i)).getId();
	}
}