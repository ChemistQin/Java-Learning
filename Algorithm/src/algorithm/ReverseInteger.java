package algorithm;



public class ReverseInteger {
	public static int reverse(int x) {
        if (x == 0) {
			return 0;
		} 
        
        String string = "";
		if (x < 0) {
			string += "-";
		} 
        
        
        
        int bits = (int)Math.log10(Math.abs(x));
        /*if (bits >= 8) {
        	System.out.println("bits = " + bits);
            return 0;
        }*/
        for (int i = 0; i <= bits; i++) {
            string += Math.abs(x) / (int)Math.pow(10, i) % 10; // x / (int)Math.pow(10, i) % 10
        }
        
        if (string.length() >= 5) {
			return 0;
		} else {
			return Integer.valueOf(string);
		}
        

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
	*/
