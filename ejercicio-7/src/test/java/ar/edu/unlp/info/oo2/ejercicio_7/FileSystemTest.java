package ar.edu.unlp.info.oo2.ejercicio_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	Directorio raiz, d1, d2, d3, d4, d5;
	Archivo a1, a2, a3, a4, a5;
	
	@BeforeEach
	void setUp() {
		raiz = new Directorio("raiz", LocalDate.of(2015, 1, 20));
		d1 = new Directorio("Directorio1", LocalDate.of(2015, 2, 25));
		d2 = new Directorio("Directorio2", LocalDate.of(2016, 5, 14));
		d3 = new Directorio("Directorio3", LocalDate.of(2017, 5, 14));
		d4 = new Directorio("Directorio4", LocalDate.of(2016, 10, 3));
		d5 = new Directorio("Directorio5", LocalDate.of(2024, 4, 14));
		
		a1 = new Archivo("Archivo1", LocalDate.of(2015, 3, 3), 24);
		a2 = new Archivo("Archivo2", LocalDate.of(2015, 3, 3), 10);
		a3 = new Archivo("Archivo3", LocalDate.of(2017, 3, 3), 80);
		a4 = new Archivo("Archivo5", LocalDate.of(2020, 3, 3), 78);
		a5 = new Archivo("Archivo5", LocalDate.of(2024, 4, 14), 2);
		
		raiz.agregar(d1);
		raiz.agregar(d2);
		raiz.agregar(a1);
		d1.agregar(d3);
		d1.agregar(d4);
		d1.agregar(a2);
		d4.agregar(d5);
		d2.agregar(a3);
		d3.agregar(a4);
		d5.agregar(a5);
	}
	
	@Test
	public void tamanoTotalOcupadoTest() {
		assertEquals(raiz.tamanoTotalOcupado(), 386);
	}
	
	@Test
	public void archivoMasGrandeTest() {
		assertEquals(raiz.archivoMasGrande(), a3);
	}
	
	@Test
	public void archivoMasNuevoTest() {
		assertEquals(raiz.archivoMasNuevo(), a5);
	}
	
	@Test
	public void buscarTest() {
		assertEquals(raiz.buscar("Archivo5"), a4);
	}
	
	@Test
	public void buscarTodosTest() {
		List<FileSystem> lista = raiz.buscarTodos("Archivo5");
		assertEquals(lista.size(), 2);
		assertEquals(lista.get(0), a4);
		assertEquals(lista.get(1), a5);
		assertEquals(raiz.buscarTodos("raiz").get(0), raiz);
	}
}
