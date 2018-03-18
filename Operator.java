public class Operator {
	public static void main(String[] args) {
		int x = 1 , y = 2 , z = 3;
		int a = x * x + y * y + z * z;
		System.out.println("a = " + a);	
		
		int i = -1;
		System.out.println(Integer.toBinaryString(i)); //int 32位，输出32个1
		i >>>= 3;//位运算 右移(>>>= , >>=)
		System.out.println(Integer.toBinaryString(i));
		i >>= 3;
		System.out.println(Integer.toBinaryString(i));
		i <<= 3;//左移<<=(<<<= is illegal) 
		System.out.println(Integer.toBinaryString(i));
	}
}