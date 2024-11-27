package ar.edu.unlp.info.oo2.ejercicio_16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {
	private HomeWeatherStationAdapter hA;
	private GradosFahrenheitDecorator tF;
	private GradosCelciusDecorator tC;
	private MaxCelciusDecorator maxC;
	private MinCelciusDecorator minC;
	private MaxFahrenheitDecorator maxF;
	private MinFahrenheitDecorator minF;
	private PromedioCelciusDecorator pC;
	private PromedioFahrenheitDecorator pF;
	private PresionDecorator p;
	private RadiacionSolarDecorator rS;

	@BeforeEach
	public void setUp() {
		this.hA = new HomeWeatherStationAdapter(new HomeWeatherStation());
	}

	@Test
	public void testDisplayData1() {
		assertEquals("", hA.displayData());
		assertEquals(67.6, hA.getTemperatura());
		this.tC = new GradosCelciusDecorator(hA);
		assertEquals("Temperatura C: 19.78; ", this.tC.displayData());
		this.p = new PresionDecorator(tC);
		this.rS = new RadiacionSolarDecorator(p);
		assertEquals("Temperatura C: 19.78; Presion: 1008.0; Radiacion solar: 400.0; ",
				this.rS.displayData());
	}

	@Test
	public void testDisplayData2() {
		this.tF = new GradosFahrenheitDecorator(hA);
		this.p = new PresionDecorator(tF);
		this.rS = new RadiacionSolarDecorator(p);
		this.pF = new PromedioFahrenheitDecorator(rS);
		assertEquals(
				"Temperatura F: 67.6; Presion: 1008.0; Radiacion solar: 400.0; Promedio: 68.875; ",
				this.pF.displayData());

	}

	@Test
	public void testDisplayData3() {
		this.tF = new GradosFahrenheitDecorator(hA);
		this.p = new PresionDecorator(tF);
		this.rS = new RadiacionSolarDecorator(p);
		this.pF = new PromedioFahrenheitDecorator(rS);
		this.maxF = new MaxFahrenheitDecorator(pF);
		this.minF = new MinFahrenheitDecorator(maxF);
		assertEquals(
				"Temperatura F: 67.6; Presion: 1008.0; Radiacion solar: 400.0; Promedio: 68.875; Maxima: 98.1; Minima: 40.5; ",
				this.minF.displayData());
	}

	@Test
	public void testDisplayData4() {
		this.tC = new GradosCelciusDecorator(hA);
		this.p = new PresionDecorator(tC);
		this.rS = new RadiacionSolarDecorator(p);
		this.pC = new PromedioCelciusDecorator(rS);
		this.maxC = new MaxCelciusDecorator(pC);
		this.minC = new MinCelciusDecorator(maxC);
		assertEquals(
				"Temperatura C: 19.78; Presion: 1008.0; Radiacion solar: 400.0; Promedio: 20.49; Maxima: 36.72; Minima: 4.72; ",
				this.minC.displayData());
	}

	@Test
	public void testDisplayData5() {
		this.maxF = new MaxFahrenheitDecorator(hA);
		this.minC = new MinCelciusDecorator(maxF);
		this.rS = new RadiacionSolarDecorator(minC);
		this.tC = new GradosCelciusDecorator(rS);
		this.p = new PresionDecorator(tC);
		this.minF = new MinFahrenheitDecorator(p);
		this.pC = new PromedioCelciusDecorator(minF);
		this.pF = new PromedioFahrenheitDecorator(pC);
		this.tF = new GradosFahrenheitDecorator(pF);
		assertEquals(
				"Maxima: 98.1; Minima: 4.72; Radiacion solar: 400.0; Temperatura C: 19.78; Presion: 1008.0; Minima: 40.5; Promedio: 20.49; Promedio: 68.875; Temperatura F: 67.6;",
				this.tF.displayData());
	}
}
