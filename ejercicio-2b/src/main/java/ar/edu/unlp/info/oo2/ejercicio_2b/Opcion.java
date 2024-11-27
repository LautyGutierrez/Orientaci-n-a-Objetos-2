package ar.edu.unlp.info.oo2.ejercicio_2b;

public abstract class Opcion {
	private String nombre;
	
	public Opcion(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String jugar(Opcion rival);
	public abstract String jugarContraPapel();
	public abstract String jugarContraTijera();
	public abstract String jugarContraPiedra();
	public abstract String jugarContraLagarto();
	public abstract String jugarContraSpock();
	
	protected String piedraVSPapel() {
		return "El papel envuelve a la piedra, ";
	}
	
	protected String piedraVSTijera() {
		return "La piedra rompe la tijera, ";
	}
	
	protected String tijeraVSPapel() {
		return "La tijera corta el papel, ";
	}
	
	protected String lagartoVSSpock() {
		return "El lagarto envenena a Spock, ";
	}
	
	protected String lagartoVSPapel() {
		return "El lagarto se come al papel, ";
	}
	
	protected String piedraVSLagarto() {
		return "La piedra aplasta al lagarto, ";
	}
	
	protected String tijeraVSLagarto() {
		return "La tijera decapita al lagarto, ";
	}
	
	protected String spockVSPapel() {
		return "El papel desaprueba a Spock, ";
	}
	
	protected String piedraVSSpock() {
		return "Spock pulveriza a la piedra, ";
	}
	
	protected String tijeraVSSpock() {
		return "Spock rompe la tijera, ";
	}
}
