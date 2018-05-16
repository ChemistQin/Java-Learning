package C6;

public class RemoteLoaderUndoTest {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
		
		
		remoteControlWithUndo.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);
		remoteControlWithUndo.undoButtonWasPushed();
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);
		remoteControlWithUndo.undoButtonWasPushed();
	}
}
