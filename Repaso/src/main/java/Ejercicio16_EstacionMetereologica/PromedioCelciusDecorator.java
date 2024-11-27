package Ejercicio16_EstacionMetereologica;

public class PromedioCelciusDecorator extends WeatherDecorator{
	public PromedioCelciusDecorator(WeatherData weather) {
		super(weather);
	}
	
	public String displayData() {
		return super.displayData() + "Promedio C: " + this.convertirACelcius(this.getPromedio()) + "\n";
	}
}
