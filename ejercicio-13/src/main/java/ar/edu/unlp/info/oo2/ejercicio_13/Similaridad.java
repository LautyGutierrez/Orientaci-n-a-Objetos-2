package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class Similaridad implements TipoSugerencia{
	public Similaridad() {
		
	}
	
	public List<Pelicula> sugerir(List<Pelicula> reproducidas, List<Pelicula> grilla){
		Set<Pelicula> peliculasSimilares = reproducidas.stream()
				.flatMap(peli -> peli.getSimilares().stream())
				.collect(Collectors.toSet());
		return peliculasSimilares.stream()
				.filter(peli -> !reproducidas.contains(peli))
				.sorted((p1, p2) -> Integer.compare(p2.estreno(), p1.estreno()))
				.limit(3).collect(Collectors.toList());
	}
}
