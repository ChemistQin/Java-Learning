package C8;

import java.util.*;


public class DuckTest {
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("0xabc", 5.5),
				new Duck("0xbcd", 6.1),
				new Duck("0xfff", 4.7),
				new Duck("0x000", 7.4)
		};
		display(ducks);
		Arrays.sort(ducks);
		display(ducks);
		
 	}
	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
