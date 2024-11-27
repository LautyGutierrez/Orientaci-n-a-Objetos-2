package ar.edu.unlp.info.oo2.ejercicio_16;

public class PromedioCelciusDecorator extends WeatherDecorator{
	public PromedioCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Promedio: " + this.conversionCelsius(this.promedio(getTemperaturas())) + "; ";
	}
}
