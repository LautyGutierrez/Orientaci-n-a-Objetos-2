package ar.edu.unlp.info.oo2.ejercicio_16;

public class MinFahrenheitDecorator extends WeatherDecorator{
	public MinFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Minima: " + this.minima(getTemperaturas()) + "; ";
	}
}
