package containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethod {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.addAll(Countries.names(6));
		collection.add("ten");
		collection.add("eleven");
		System.out.println(collection);
		
		Object[] array = collection.toArray();
		String[] strings = collection.toArray(new String[0]);
		
		System.out.println(Collections.max(collection));
		System.out.println(Collections.min(collection));
		
		
	}
}
