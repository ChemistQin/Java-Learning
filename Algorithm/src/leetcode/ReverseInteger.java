package leetcode;



public class ReverseInteger {
	public static int reverse(int x) {
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
	public static void main(String[] args) {
		
		System.out.println(ReverseInteger.reverse(-2147483648));
		//String s1 = "@432578679768790";
		//System.out.println(s1.length());
	}
	
}

/*
 *
 * public static void main(String[] args) {
		int x = -2147483648;
		int solution = 0;
		String string = "";
		if (x < 0) {
			string += "-";
		} else if (x == 0) {
			solution = 0;
		} else {
			int bits = (int)Math.log10(Math.abs(x));
			if (bits >= 8) {
				solution = 0;
			}
			
			for (int i = 0; i <= bits; i++) {
				string += Math.abs(x) / (int)Math.pow(10, i) % 10; // x / (int)Math.pow(10, i) % 10
			}
			
			solution = Integer.valueOf(string);
		}
		
		
		System.out.println(solution);
		//System.out.println(bits);
	}
	-2147483648 会发生溢出
	*/
