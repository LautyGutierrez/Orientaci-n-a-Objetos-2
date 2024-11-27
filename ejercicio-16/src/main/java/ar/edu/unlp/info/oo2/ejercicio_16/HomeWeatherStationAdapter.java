package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData{
	private HomeWeatherStation weather;
	
	public HomeWeatherStationAdapter(HomeWeatherStation weather) {
		this.weather = weather;
	}
	
	public double getTemperatura() {
		return this.weather.getTemperatura();
	}
	
	public double getPresion() {
		return this.weather.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.weather.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas(){
		return this.weather.getTemperaturas();
	}
	
	public String displayData() {
		return "";
	}
}
