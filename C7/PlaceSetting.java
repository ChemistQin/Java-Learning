package C7;
class Plate {
	Plate(int i) {
		System.out.println("Plate");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate");
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println("Utensil");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println("Knife");
	}
}

class Cunstom {
	Cunstom(int i) {
		System.out.println("Cunstom");
	}
}

public class PlaceSetting extends Cunstom {
	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate dinnerPlate;
	public PlaceSetting(int i) {
		super(i + 1);
		spoon = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		dinnerPlate = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting");
	}
	public static void main(String[] args) {
		PlaceSetting ps = new PlaceSetting(1);
	}
}