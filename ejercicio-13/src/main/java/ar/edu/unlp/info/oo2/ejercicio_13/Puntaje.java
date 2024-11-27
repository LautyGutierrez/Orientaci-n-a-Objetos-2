package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements TipoSugerencia{
	public Puntaje() {
		
	}
	
	public List<Pelicula> sugerir(List<Pelicula> reproducidas, List<Pelicula> grilla){
		return reproducidas.stream()
				.flatMap(peli -> peli.getSimilares().stream())
				.filter(peli -> !reproducidas.contains(peli))
				.sorted((p1, p2) -> {
					int a = Double.compare(p2.rating(), p1.rating());
					if(a == 0) {
						return Integer.compare(p2.estreno(), p1.estreno());
					} else {
						return a;
					}
				})
				.limit(3)
				.collect(Collectors.toList());
	}
}
