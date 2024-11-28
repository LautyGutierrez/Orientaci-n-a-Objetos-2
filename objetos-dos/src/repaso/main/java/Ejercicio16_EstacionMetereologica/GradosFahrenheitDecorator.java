package Ejercicio16_EstacionMetereologica;

public class GradosFahrenheitDecorator extends WeatherDecorator{
	public GradosFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura F: " + this.getTemperatura() + "\n";
	}
}
