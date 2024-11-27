package ar.edu.unlp.info.oo2.ejercicio_9;

public class EnEspera extends Estado{
	public EnEspera() {
		
	}
	
	public void inscribir(Excursion e, Usuario u) {
		e.getListaDeEspera().add(u);
	}
	
	
}
