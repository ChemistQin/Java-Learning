package C8.Cycle;
public class Upcasting {
	public static void ride_2(Cycle c) {
		c.ride();
	}
	public static void wheels_2(Cycle c) {
		System.out.println("wheels number = " + c.wheels() );

	}
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle uc = new Unicycle();
		ride_2(c);
		wheels_2(c);
		ride_2(uc);
		wheels_2(uc);

	}
}