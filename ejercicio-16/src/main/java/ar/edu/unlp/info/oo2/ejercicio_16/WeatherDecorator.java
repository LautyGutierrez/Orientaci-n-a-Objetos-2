package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData{
	private WeatherData weather;
	
	public WeatherDecorator(WeatherData weather) {
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
		return this.weather.displayData();
	}
	
	public double conversionCelsius(double valor) {
		return Math.round(((valor - 32) / 1.8) * 100.0) / 100.0; // redondeo a 2 decimales
	}

	public double promedio(List<Double> temperaturas) {
		return temperaturas.stream().mapToDouble(t -> t).sum() / temperaturas.size();
	}

	public double maxima(List<Double> temperaturas) {
		return temperaturas.stream().max((t1, t2) -> Double.compare(t1, t2)).orElse(null);
	}

	public double minima(List<Double> temperaturas) {
		return temperaturas.stream().min((t1, t2) -> Double.compare(t1, t2)).orElse(null);
	}
}
