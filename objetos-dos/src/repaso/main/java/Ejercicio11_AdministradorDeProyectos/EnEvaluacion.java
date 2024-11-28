package Ejercicio11_AdministradorDeProyectos;

public class EnEvaluacion extends Etapa{
	public void aprobarEtapa(Proyecto p) {
		p.setEtapa(new Confirmada());
	}
	
	public void modificarMargen(Proyecto p, double margen) {
		if(margen >= 0.11 && margen <= 0.15) p.setMargen(margen);
	}
}
