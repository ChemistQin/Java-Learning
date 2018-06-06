package algorithm;

public class TestDriver {
	public static void main(String[] args) {
		int[] array = {3, 2, 5, 7, 13, 21, 19, 23, 11};
		Sorter sorter = new Sorter();
		//sorter.selectSort(array);
		sorter.quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
