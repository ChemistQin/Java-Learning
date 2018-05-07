package C2;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(33, 55, 30.4f);
		weatherData.setMeasurements(26, 59, 29.4f);
	}
}
