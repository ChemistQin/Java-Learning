package algorithm;


public class Sorter {
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}
	
	public static void selectSort(int[] array) {
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
	
	public static void insertSort(int[] array) {
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
	
	public static void quickSort(int[] array, int begin, int end) {
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
	
	public static void heapAdjust(int[] array, int i, int n) {
		int child, father;
		for (father = array[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			if (child != n - 1 && array[child] < array[child + 1]) {
				child++;
			}
			if (father < array[child]) {
				array[i] = array[child];
			} else {
				break;
			}
		}
		array[i] = father;
	}
	
	public static int leftChild(int i) {
		return 2 * i + 1;
	}
	
	public static void heapSort(int[] array) {
		for (int i = array.length/2; i >= 0; i--) {
			heapAdjust(array, i, array.length);
		}
		for (int i = array.length - 1; i > 0; i--) {
			swap(array, 0, i);
			heapAdjust(array, 0, i);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
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

