package algorithm;

public class NumberTest {
	public static void main(String[] args) {
		Integer x = 6;
		System.out.println(x.intValue());
		System.out.println(x.floatValue());
		System.out.println(Integer.toHexString(1314));
		System.out.println(Integer.toBinaryString(1111));
		System.out.println(Integer.parseInt("Kona", 27));
		/*
		 * 27进制
		 * 1 2 3 4 5 6 7 8 9 A
		 * B C D E F G H I J K
		 * L M N O P Q R 
		 * Kona = 20 * 27 ^ 3 + 24 * 27 ^ 2 + 23 * 27 + 10
		 */
		System.out.println(20 * Math.pow(27, 3) + 
						   24 * Math.pow(27, 2) + 
						   23 * Math.pow(27, 1) +
						   10 * Math.pow(27, 0));
	}
}
