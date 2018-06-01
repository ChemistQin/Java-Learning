package mvc;

public class HeartController implements ControllerInterface {
	HeartModelInterface modelInterface;
	DJView view;
	
	public HeartController(HeartModelInterface modelInterface) {
		this.modelInterface = modelInterface;
		view = new DJView(this, new HeartAdapter(modelInterface));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
	
	public void start() {}
	
	public void stop() {}
	
	public void increaseBPM() {}
	
	public void decreaseBPM() {}
	
 	public void setBPM(int bpm) {}
}
