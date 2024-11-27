package ar.edu.unlp.info.oo2.ejercicio_11;

public class EnConstruccion extends Etapa{
	public EnConstruccion() {
		
	}
	
	public void aprobarEtapa(Proyecto p) {
		if(p.precioNoEsCero()) {
			p.setEtapa(new EnEvaluacion());
		} else {
			throw new RuntimeException("ERROR: El precio del proyecto es cero");
		}
	}
	
	public void modificarMargenDeGanancia(Proyecto p, double valor) {
		if(valor >= 0.08 && valor <= 0.1) p.setMargen(valor);
	}
}
