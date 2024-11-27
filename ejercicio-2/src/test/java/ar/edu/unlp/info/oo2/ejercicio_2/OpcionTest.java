package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OpcionTest {
	Opcion piedra, tijera, papel;
	
	@BeforeEach
	void setUP() {
		piedra = new Piedra();
		tijera = new Tijera();
		papel = new Papel();
	}
	@Test
	public void jugarContraTijeraTest() {
		assertEquals(tijera.jugarContraTijera(), "Empate");
		assertEquals(piedra.jugarContraTijera(), "La piedra rompe la tijera, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugarContraTijera(), "La tijera corta el papel, ¡¡¡PERDÍ!!!");
	}
	
	@Test
	public void jugarContraPiedraTest() {
		assertEquals(piedra.jugarContraPiedra(), "Empate");
		assertEquals(tijera.jugarContraPiedra(), "La piedra rompe la tijera, ¡¡¡PERDÍ!!!");
		assertEquals(papel.jugarContraPiedra(), "El papel envuelve a la piedra, ¡¡¡GANÉ!!!");
	}
	
	@Test
	public void jugarContraPapelTest() {
		assertEquals(papel.jugarContraPapel(), "Empate");
		assertEquals(tijera.jugarContraPapel(), "La tijera corta el papel, ¡¡¡GANÉ!!!");
		assertEquals(piedra.jugarContraPapel(), "El papel envuelve a la piedra, ¡¡¡PERDÍ!!!");
	}
	
	@Test
	public void jugarTest() {
		assertEquals(papel.jugar(papel), "Empate");
		assertEquals(papel.jugar(tijera), "La tijera corta el papel, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugar(piedra), "El papel envuelve a la piedra, ¡¡¡PERDÍ!!!");
		
		assertEquals(piedra.jugar(piedra), "Empate");
		assertEquals(piedra.jugar(papel), "El papel envuelve a la piedra, ¡¡¡GANÉ!!!");
		assertEquals(piedra.jugar(tijera), "La piedra rompe la tijera, ¡¡¡PERDÍ!!!");
		
		assertEquals(tijera.jugar(tijera), "Empate");
		assertEquals(tijera.jugar(piedra), "La piedra rompe la tijera, ¡¡¡GANÉ!!!");
		assertEquals(tijera.jugar(papel), "La tijera corta el papel, ¡¡¡PERDÍ!!!");
	}
}
