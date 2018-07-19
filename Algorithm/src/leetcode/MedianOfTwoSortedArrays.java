package leetcode;

public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l1 = nums1.length;
		double m1 = 0;
		if (l1 % 2 == 1) {
			m1 = (nums1[l1 / 2] + nums1[l1 / 2 + 1]) / 2;
		} else {
			m1 = nums1[l1 / 2];
		}
		
		int l2 = nums2.length;
		double m2 = 0;
		if (l2 % 2 == 1) {
			m2 = (nums1[l2 / 2] + nums1[l2 / 2 + 1]) / 2;
		} else {
			m2 = nums1[l2 / 2];
		}
        return (m1 + m2) / 2;
    }
	
	public static void main(String[] args) {
		int[] nums1 = { 2 , 4 ,5, 6 };
		int[] nums2 = {4 ,7 ,8 ,9 };
		MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
	}
}
