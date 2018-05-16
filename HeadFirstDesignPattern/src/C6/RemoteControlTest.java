package C6;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light("");
		GarageDoor garageDoor = new GarageDoor("");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		remoteControl.setCommand(lightOn );
		remoteControl.buttonWasPressed();
		remoteControl.setCommand(garageDoorOpenCommand);
		remoteControl.buttonWasPressed();
	}
}
