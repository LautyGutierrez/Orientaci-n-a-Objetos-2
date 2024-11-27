package ar.edu.unlp.info.oo2.ejercicio_16;

public class PromedioFahrenheitDecorator extends WeatherDecorator{
	public PromedioFahrenheitDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Promedio: " + this.promedio(getTemperaturas()) + "; ";
	}
}
