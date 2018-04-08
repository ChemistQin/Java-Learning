package C8.Navy;

class WarShip {
	public void sail() {}
}

class AircraftCarrier extends WarShip {
	public void sail() {
		System.out.println("CV");
	}
}

class Battleship extends WarShip {
	public void sail() {
		System.out.println("BB");
	}
}

/*
class Destroyer extends WarShip {
	public void sail() {
		System.out.println("DD");
	}
}
*/

class Fleet {
	private WarShip warship = new AircraftCarrier();
	public void change() {
		warship = new Battleship();
	}
	public void shipSail() {
		warship.sail();
	}

}
public class Flagship {
	public static void main(String[] args) {
		Fleet fleet = new Fleet();
		fleet.shipSail();
		fleet.change();
		fleet.shipSail();
	}
}
