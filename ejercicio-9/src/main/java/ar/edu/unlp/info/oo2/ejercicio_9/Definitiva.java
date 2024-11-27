package ar.edu.unlp.info.oo2.ejercicio_9;

import java.util.List;
import java.util.stream.Collectors;

public class Definitiva extends Estado{
	public Definitiva() {
		
	}
	
	public String info(Excursion e) {
		int faltantes = e.getCupoMaximo() - e.getInscriptos().size();
		return super.info(e) + "Emails: " + listaEmails(e.getInscriptos()) +
				"\n" + "Cantidad de usuarios faltantes: " + faltantes;
	}
	
	private String listaEmails(List<Usuario> users) {
		return users.stream().map(u -> u.getEmail()).collect(Collectors.joining("\n"));
	}
	
	public void inscribir(Excursion e, Usuario u) {
		e.getInscriptos().add(u);
		if(e.getInscriptos().size() == e.getCupoMaximo()) e.setEstado(new EnEspera());
	}
}
