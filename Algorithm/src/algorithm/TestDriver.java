package algorithm;

public class TestDriver {
	public static void main(String[] args) {
		
		int[] array = {33, 7, 5, 2, 1, 211, 19, 23, 11};
		Sorter sorter = new Sorter();
		//sorter.selectSort(array);
		//sorter.quickSort(array, 0, array.length - 1);
		//sorter.bubbleSort(array);
		System.out.println("before:");
		sorter.printArray(array);
		System.out.println("\nafter:");
		sorter.heapSort(array);
		sorter.printArray(array);
		
		
		
	}
}

/*
June 7, 2018
System.out.println("Happy " + 0b00011000 + "th Birthday");
System.out.println("Happy " + 24 + "th Birthday");
System.out.println("Happy " + 0x18 + "th Birthday");

	int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
[I@61064425
[I@7b1d7fff
[I@299a06ac
[I@383534aa
[I@6bc168e5

二维数组...arr[i] 值为地址
		
*/