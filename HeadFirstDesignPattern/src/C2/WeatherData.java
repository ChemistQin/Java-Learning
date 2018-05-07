package C2;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float presure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void remoteObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i >= 0)
			observers.remove(i);
	}
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, presure);
		}
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	public void setMeasurements(float temp, float humidity, float presure) {
		this.temp = temp;
		this.humidity = humidity;
		this.presure = presure;
		measurementsChanged();
	}
}
