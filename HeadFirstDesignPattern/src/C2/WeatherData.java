package C2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
// The type Observable is deprecated since version 9

@SuppressWarnings("deprecation")
public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float presure;
	
	public WeatherData() {}
	//public void registerObserver(Observer observer) {
	//	observers.add(observer);
	//}
	//public void remoteObserver(Observer observer) {
	//	int i = observers.indexOf(observer);
	//	if(i >= 0)
	//		observers.remove(i);
	//}
	//public void notifyObservers() {
	//	for(int i = 0; i < observers.size(); i++) {
	//		Observer observer = (Observer)observers.get(i);
	//		observer.update(temp, humidity, presure);
	//	}
	//}
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float presure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.presure = presure;
		measurementsChanged();
	}
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPresure() {
		return presure;
	}
}
