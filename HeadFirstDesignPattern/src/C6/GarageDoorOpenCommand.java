package C6;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor = new GarageDoor();
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	public void execute() {
		garageDoor.open();
	}
}
