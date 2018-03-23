class Zhangzhe {
	public void speak() {
		System.out.println("一句话也不说");
	}
	public void speak(int i) {
		System.out.println("坠吼");
	} 
	public void speak(double d) {
		System.out.println("Angry！");
	} 
	public void speak(int i , double d) {
		System.out.println("坠吼");
		System.out.println("Angry！");
	} 
	public void speak(double d , int i) {
		System.out.println("Angry！");
		System.out.println("坠吼");
	} 
}

public class C5E5 {
	public static void main(String[] args) {
		Zhangzhe JIANG = new Zhangzhe();
		//JIANG.speak();
		//JIANG.speak(1);
		//JIANG.speak(6.6);
		JIANG.speak(2,6.6);
		JIANG.speak(3.14,1);
	}
}