public class C5E2 {
	String s1 = "sometimes naive";
	String s2;
	public C5E2(String s20) {
		s2 = s20;
	}
	public static void main(String[] args) {
		C5E2 sstr = new C5E2("too young too simple"); 
		System.out.println("sstr.s1 = " + sstr.s1);  // s1 定义
		System.out.println("sstr.s2 = " + sstr.s2);  // s2 初始化
	}
}