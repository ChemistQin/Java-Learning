package C10.Parcell7;

interface Contents {	
	int value() ;
}

public class Parcell7 {
	public Contents contents() {
		return new Contents() {
			private int i = 66;
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcell7 p7 = new Parcell7();
		Contents c7 = p7.contents();
		System.out.println(c7.value());
	}
}