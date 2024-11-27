package ar.edu.unlp.info.oo2.ejercicio_2;

public abstract class Opcion {
	private String nombre;
	
	public Opcion(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String jugar(Opcion rival);
	public abstract String jugarContraPapel();
	public abstract String jugarContraTijera();
	public abstract String jugarContraPiedra();
	
	protected String piedraVSPapel() {
		return "El papel envuelve a la piedra, ";
	}
	
	protected String piedraVSTijera() {
		return "La piedra rompe la tijera, ";
	}
	
	protected String tijeraVSPapel() {
		return "La tijera corta el papel, ";
	}
}
