package algorithm;

public class TestDriver {
	public static void main(String[] args) {
		
		int[] array = {33, 7, 5, 2, 1, 211, 19, 23, 11};
		Sorter sorter = new Sorter();
		//sorter.selectSort(array);
		//sorter.quickSort(array, 0, array.length - 1);
		sorter.bubbleSort(array);
		sorter.printArray(array);
		
		
		
	}
}

/*
June 7, 2018
System.out.println("Happy " + 0b00011000 + "th Birthday");
System.out.println("Happy " + 24 + "th Birthday");
System.out.println("Happy " + 0x18 + "th Birthday");
*/