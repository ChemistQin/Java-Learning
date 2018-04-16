package C10;

public class Parcell {
	class Contents {
		private int i = 66;
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	public void ship(String destination) {
		Contents con = new Contents();
		Destination dest = new Destination(destination);
		System.out.println(dest.readLabel());
	}
	public static void main(String[] args) {
		Parcell par = new Parcell();
		par.ship("China");
	}
}