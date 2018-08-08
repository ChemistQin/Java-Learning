package containers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import arrays.Generator;
import arrays.RandomGenerator;

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
	
		private int size = 9;
		private int number = 1;
		private char letter = 'A';
		public Pair<Integer, String> next() {
			return new Pair<Integer, String>(number++,"" + letter++);
		}
	
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {
			public Integer next() {
				return number++;
			}
			public boolean hasNext() {
				return number < size;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
	
public class MapDataTest {
	public static void main(String[] args) {
		System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(6), 10)));
		System.out.println(new HashSet<Integer>(new CollectionData<>(new RandomGenerator.Integer(), 10)));
	}
}
