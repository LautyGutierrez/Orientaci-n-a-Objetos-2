package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements TipoSugerencia{
	public Novedad() {
		
	}
	
	public List<Pelicula> sugerir(List<Pelicula> reproducidas, List<Pelicula> grilla){
		return grilla.stream().sorted((p1, p2) -> Integer.compare(p2.estreno(), p1.estreno())).limit(3).collect(Collectors.toList());
	}
}
