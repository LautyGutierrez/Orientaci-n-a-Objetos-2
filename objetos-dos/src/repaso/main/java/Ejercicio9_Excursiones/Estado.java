package Ejercicio9_Excursiones;

public abstract class Estado {
	
	public String informacion(Excursion e) {
		return "Nombre: " + e.getNombre() + "\n"
				+ "Costo: " + e.getCosto() + "\n"
				+ "Fecha de inicio: " + e.getFechaInicio().toString() + "\n"
				+ "Fecha de fin: " + e.getFechaFin().toString() + "\n"
				+ "Punto de encuentro: " + e.getPuntoEncuentro() + "\n";
	}
	
	public abstract void inscribir(Excursion e, Usuario user);
}
