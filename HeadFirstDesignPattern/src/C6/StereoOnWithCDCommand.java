package C6;

public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(12);
	}
	public void undo() {
		
	}
}
