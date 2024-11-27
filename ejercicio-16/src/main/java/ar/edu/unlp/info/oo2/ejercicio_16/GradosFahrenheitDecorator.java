package ar.edu.unlp.info.oo2.ejercicio_16;

public class GradosFahrenheitDecorator extends WeatherDecorator{
	public GradosFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura F: " + this.getTemperatura() + "; ";
	}
}
