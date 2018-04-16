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
	public Destination to(String s) {
		return new Destination(s);
	}
	public Contents contents() {
		return new Contents();
	}
	public void ship(String destination) {
		Contents con = new Contents();
		Destination dest = new Destination(destination);
		System.out.println(dest.readLabel());
	}
	public static void main(String[] args) {
		Parcell par1 = new Parcell();
		par1.ship("China");
		Parcell par2 = new Parcell();
		Parcell.Contents con = par2.contents();
		Parcell.Destination dest = par2.to("U.S");
	}
}