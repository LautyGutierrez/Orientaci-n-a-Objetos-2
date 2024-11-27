package Ejercicio16_EstacionMetereologica;

public class RadiacionSolarDecorator extends WeatherDecorator{
	public RadiacionSolarDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Radiacion solar: " + this.getRadiacionSolar() + "\n";
	}
}
