package C10.Parcell7;

interface Contents11 {	
	int value() ;
}

interface Destination11 {
	String readLabel();
}

public class Parcell11 {
	public static class PacellContents implements Contents11 {
		private int i = 66;
		public int value() {
			return i;
		}
	}
	protected static class ParcellDestination implements Destination11 {
		private String label;
		private ParcellDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
		public static void f() {}
		static int x = 22;
		static class AnotherLevel {
			public static void f() {}
			static int x = 22;
		}
	}
	public static Destination11 destination(String s) {
		return new ParcellDestination(s);
	}
	public static Contents11 contents() {
		return new PacellContents();
	} 
	public static void main(String[] args) {
		Contents11 c = contents();
		Destination11 d = destination("Shanghai");
		System.out.println(d.readLabel());
	}
}