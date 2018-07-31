package generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random ramd = new Random(53);
	
	public void add(T item) {
		storage.add(item);
	}
	
	public T select() {
		return storage.get(ramd.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		System.out.println("RandomList<String> :");
		
		RandomList<String> rs = new RandomList<String>();
		for (String string : "the quick browm fox jumped over the lazy brown dog".split(" ") ) {
			rs.add(string);
		}
		for (int i = 0; i < 11; i++) {
			System.out.print(rs.select() + " ");
		}
		
		
		System.out.println("\nRandomList<Integer> :");
		
		RandomList<Integer> ri = new RandomList<Integer>();
		int[] nums = {2, 54 , 8,897};
		for (int i : nums) {
			ri.add(i);
		}
		for (int i= 0;  i < nums.length; i++) {
			System.out.print(ri.select() + " ");
		}
		
	}
}
