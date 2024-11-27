package Ejercicio16_EstacionMetereologica;

public class MaxFahrenheitDecorator extends WeatherDecorator{
	public MaxFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Maxima F: " + this.getTemperaturaMaxima() + "\n";
	}
}
