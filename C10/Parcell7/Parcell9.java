package C10.Parcell7;

interface Destination {
	String readLabel();
}

public class Parcell9 {
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcell9  p9 = new Parcell9();
		Destination d9 = p9.destination("Shenzhen");
		System.out.println(d9.readLabel());
	}
}