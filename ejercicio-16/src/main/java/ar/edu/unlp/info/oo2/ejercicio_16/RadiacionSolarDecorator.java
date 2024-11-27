package ar.edu.unlp.info.oo2.ejercicio_16;

public class RadiacionSolarDecorator extends WeatherDecorator{
	public RadiacionSolarDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Radiacion solar: " + this.getRadiacionSolar() + "; ";
	}
}
