package ar.edu.unlp.info.oo2.ejercicio_9;

public abstract class Estado {
	public Estado() {
		
	}
	
	public String info(Excursion e) {
		return "Nombre: " + e.getNombre() + "\n" +
			"Costo: " + e.getCosto() + "\n" +
			"Fecha de inicio: " + e.getFechaInicio().getDayOfMonth() + "/" + e.getFechaInicio().getMonth() + "/" + e.getFechaInicio().getYear() +
			"\n" + "Fecha de fin: " + e.getFechaFin().getDayOfMonth() + "/" + e.getFechaFin().getMonth() + "/" + e.getFechaFin().getYear() + "\n"
			+ "Punto de encuentro: " + e.getPuntoDeEncuentro() + "\n";
	}
	
	public abstract void inscribir(Excursion e, Usuario u);
}
