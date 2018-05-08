//C7E2
package C7;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}

public static void main(String[] args) {
	Cleanser x = new Cleanser();
	x.dilute();
	x.apply();
	x.scrub();
	System.out.println(x);
}

}

class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam() {
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		Cleanser.main(args);
	}
}


public class Naive extends Detergent {
	public void scrub() {
		append(" Naive.scrub()");
		super.scrub();
	}

	public void xu() {
		append(" xu()");
	}
	public static void main(String[] args) {
		Naive x = new Naive();
		x.dilute();
		x.apply();
		x.scrub();
		x.xu();
		System.out.println(x);
	}
}