package ar.edu.unlp.info.oo2.ejercicio_11;

public class EnEvaluacion extends Etapa{
	public EnEvaluacion() {
		
	}
	
	public void aprobarEtapa(Proyecto p) {
		p.setEtapa(new Confirmada());
	}
	
	public void modificarMargenDeGanancia(Proyecto p, double valor) {
		if(valor >= 0.11 && valor <= 0.15) p.setMargen(valor);
	}
}
