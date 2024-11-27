package ar.edu.unlp.info.oo2.ejercicio_16;

public class MinCelciusDecorator extends WeatherDecorator{
	public MinCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Minima: " + this.conversionCelsius(this.minima(getTemperaturas())) + "; ";
	}
}
