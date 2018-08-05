package containers;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		String[] words = ("ywwuyi died " + "ywwuyi nb").split(" ");
		return new Iterator<String>() {
			private int index = 0;
			public boolean hasNext() {
				return index < words.length;
			}

			public String next() {
				return words[index++];
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for (String string : new IterableClass()) {
			System.out.print(string + ",");
		}
	}
	
}
