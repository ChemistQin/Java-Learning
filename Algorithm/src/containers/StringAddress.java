package containers;

public class StringAddress {
	private String string;
	public StringAddress(String string) {
		this.string = string;
	}
	@Override
	public String toString() {
		return super.toString() + " " + string;
	}
}
