package Strings;

public class SimpleFormat {
	public static void main(String[] args) {
		int x = 1;
		double y = 3.1415926;
		System.out.println("----" + x + "----" + y + "----");
		System.out.format("----%d----%.7f----\n", x,y);
		System.out.printf("----%d----%.7f----\n", x,y);
	}

}
//in this case, format() and printf() are eauel.