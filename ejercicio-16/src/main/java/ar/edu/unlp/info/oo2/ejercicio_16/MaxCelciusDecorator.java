package ar.edu.unlp.info.oo2.ejercicio_16;

public class MaxCelciusDecorator extends WeatherDecorator{
	public MaxCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Maxima: " + this.conversionCelsius(this.maxima(getTemperaturas())) + "; ";
	}
}
