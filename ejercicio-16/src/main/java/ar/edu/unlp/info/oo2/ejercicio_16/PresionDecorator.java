package ar.edu.unlp.info.oo2.ejercicio_16;

public class PresionDecorator extends WeatherDecorator{
	public PresionDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Presion: " + this.getPresion() + "; ";
	}
}
