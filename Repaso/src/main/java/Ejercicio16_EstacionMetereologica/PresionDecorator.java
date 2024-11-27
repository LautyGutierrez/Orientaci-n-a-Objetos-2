package Ejercicio16_EstacionMetereologica;

public class PresionDecorator extends WeatherDecorator{
	public PresionDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Presion: " + this.getPresion() + "\n";
	}
}
