package C2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			this.temperature = temperature;
			this.humidity = humidity;
			display();
		}
		
	}
	public void display() {
		System.out.println("Current conditions: " + temperature + "°C degree and " + humidity + "% humidity");
	}
}
