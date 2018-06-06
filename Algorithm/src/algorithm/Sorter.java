package algorithm;


public class Sorter {
	public void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					/*
					array[i] ^= array[j];  
					array[j] ^= array[i]; 
					array[i] ^= array[j];
					*/
					swap(array, i, j);
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
	
	public void quickSort(int[] array, int begin, int end) {
		if (begin >= end || array == null || array.length <= 1) {
            return;
        }
        int i = begin, j = end, pivot = array[(begin + end) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i < j) {
                swap(array, i, j);
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        quickSort(array, begin, j);
        quickSort(array, i, end);
	}
	
	public static void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

}

/*test
 * int[] array = {3, 2, 5, 7, 13, 21, 19, 23, 11};
		Sorter sorter = new Sorter();
		sorter.insertSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
 */

