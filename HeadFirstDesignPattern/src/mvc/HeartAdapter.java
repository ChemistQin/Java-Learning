package mvc;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heartModelInterface;
	public HeartAdapter(HeartModelInterface heartModelInterface) {
		this.heartModelInterface = heartModelInterface;
	}
	public void initialize() {}
	
	public void on() {}
	
	public void off() {}
	
	public void setBPM(int bmp) {}
	
	public int getBPM() {
		return heartModelInterface.getHeartRate();
	}
	public void registerObserver(BeatObserver o) {
		heartModelInterface.registerObserver(o);
	}
	public void removeObserver(BeatObserver o) {
		heartModelInterface.removeObserver(o);
	}
	public void registerObserver(BPMObserver o) {
		heartModelInterface.registerObserver(o);
	}
	public void removeObserver(BPMObserver o) {
		heartModelInterface.removeObserver(o);
	}
}
