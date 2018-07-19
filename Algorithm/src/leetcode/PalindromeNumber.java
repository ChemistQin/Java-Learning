package leetcode;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} 
		if (x >= 0){
			String s1 = Integer.toString(x);
			//System.out.println(s1);
			String s2 = new StringBuffer(s1).reverse().toString();
			//System.out.println(s2);
			if (s1.equals(s2)) {
				return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		System.out.println(PalindromeNumber.isPalindrome(123));
	}
}
