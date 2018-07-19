package leetcode;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 45 , 6, 7};
		int[] solution = TwoSum.twoSum(nums, 13);
		System.out.println(solution[0] + "..." + solution[1]);
	}
}
