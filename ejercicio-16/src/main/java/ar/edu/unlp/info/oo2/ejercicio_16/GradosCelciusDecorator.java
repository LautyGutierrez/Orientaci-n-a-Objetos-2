package ar.edu.unlp.info.oo2.ejercicio_16;

public class GradosCelciusDecorator extends WeatherDecorator{
	public GradosCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public double getTemperatura() {
		return this.conversionCelsius(super.getTemperatura());
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura C: " + this.getTemperatura() + "; ";
	}
	
}
