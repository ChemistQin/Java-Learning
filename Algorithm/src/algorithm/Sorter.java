package algorithm;

public class Sorter {
	public void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] ^= array[j];  
					array[j] ^= array[i]; 
					array[i] ^= array[j];
				}
			}
		}
	}
	
	public void insertSort(int[] array) {
		int j;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				int t = array[i];
				for (j = i - 1; j >= 0 && array[j] > t; j--) {
					array[j + 1] = array[j];
				}
				array[j + 1] = t;
			}
		}
	}

}
