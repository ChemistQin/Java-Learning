package test;

import java.util.*;

public class SC {

	public static void main(String[] args) {
		Collection<Integer> colle = new ArrayList<Integer>(); 
		for(int i = 0; i < 5; i++)
			colle.add(i);
		for(Integer i : colle)
			System.out.println(i);
	}
}
