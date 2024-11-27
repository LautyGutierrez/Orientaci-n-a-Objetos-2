package ar.edu.unlp.info.oo2.ejercicio_9;

public class Provisoria extends Estado{
	public Provisoria() {
		
	}
	
	public String info(Excursion e) {
		int faltantes = e.getCupoMinimo() - e.getInscriptos().size();
		return super.info(e) + 
		"Cantidad de usuarios faltantes: " + faltantes;
	}
	
	public void inscribir(Excursion e, Usuario u) {
		e.getInscriptos().add(u);
		if(e.getInscriptos().size() == e.getCupoMinimo()) e.setEstado(new Definitiva());
	}
}
