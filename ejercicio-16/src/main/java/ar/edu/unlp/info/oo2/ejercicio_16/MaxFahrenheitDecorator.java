package ar.edu.unlp.info.oo2.ejercicio_16;

public class MaxFahrenheitDecorator extends WeatherDecorator{
	public MaxFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Maxima: " + this.maxima(getTemperaturas()) + "; ";
	}
}
