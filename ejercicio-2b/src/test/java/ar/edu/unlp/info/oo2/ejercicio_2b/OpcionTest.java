package ar.edu.unlp.info.oo2.ejercicio_2b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OpcionTest {
	Opcion tijera, piedra, papel, lagarto, spock;
	
	@BeforeEach
	void setUP() {
		tijera = new Tijera();
		piedra = new Piedra();
		papel = new Papel();
		lagarto = new Lagarto();
		spock = new Spock();
	}
	
	@Test
	public void jugarContraLagartoTest() {
		assertEquals(lagarto.jugarContraLagarto(), "Empate");
		assertEquals(piedra.jugarContraLagarto(), "La piedra aplasta al lagarto, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugarContraLagarto(), "El lagarto se come al papel, ¡¡¡PERDÍ!!!");
		assertEquals(tijera.jugarContraLagarto(), "La tijera decapita al lagarto, ¡¡¡GANÉ!!!");
		assertEquals(spock.jugarContraLagarto(), "El lagarto envenena a Spock, ¡¡¡PERDÍ!!!");
	}
	
	@Test
	public void jugarContraSpockTest() {
		assertEquals(spock.jugarContraSpock(), "Empate");
		assertEquals(piedra.jugarContraSpock(), "Spock pulveriza a la piedra, ¡¡¡PERDÍ!!!");
		assertEquals(papel.jugarContraSpock(), "El papel desaprueba a Spock, ¡¡¡GANÉ!!!");
		assertEquals(tijera.jugarContraSpock(), "Spock rompe la tijera, ¡¡¡PERDÍ!!!");
		assertEquals(lagarto.jugarContraSpock(), "El lagarto envenena a Spock, ¡¡¡GANÉ!!!");
	}
	
	
	@Test
	public void jugarContraTijera() {
		assertEquals(tijera.jugarContraTijera(), "Empate");
		assertEquals(piedra.jugarContraTijera(), "La piedra rompe la tijera, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugarContraTijera(), "La tijera corta el papel, ¡¡¡PERDÍ!!!");
		assertEquals(lagarto.jugarContraTijera(), "La tijera decapita al lagarto, ¡¡¡PERDÍ!!!");
		assertEquals(spock.jugarContraTijera(), "Spock rompe la tijera, ¡¡¡GANÉ!!!");
	}
	
	@Test
	public void jugarContraPiedraTest() {
		assertEquals(piedra.jugarContraPiedra(), "Empate");
		assertEquals(tijera.jugarContraPiedra(), "La piedra rompe la tijera, ¡¡¡PERDÍ!!!");
		assertEquals(papel.jugarContraPiedra(), "El papel envuelve a la piedra, ¡¡¡GANÉ!!!");
		assertEquals(lagarto.jugarContraPiedra(), "La piedra aplasta al lagarto, ¡¡¡PERDÍ!!!");
		assertEquals(spock.jugarContraPiedra(), "Spock pulveriza a la piedra, ¡¡¡GANÉ!!!");
	}
	
	@Test
	public void jugarContraPapelTest() {
		assertEquals(papel.jugarContraPapel(), "Empate");
		assertEquals(tijera.jugarContraPapel(), "La tijera corta el papel, ¡¡¡GANÉ!!!");
		assertEquals(piedra.jugarContraPapel(), "El papel envuelve a la piedra, ¡¡¡PERDÍ!!!");
		assertEquals(lagarto.jugarContraPapel(), "El lagarto se come al papel, ¡¡¡GANÉ!!!");
		assertEquals(spock.jugarContraPapel(), "El papel desaprueba a Spock, ¡¡¡PERDÍ!!!");
	}
	
	@Test
	public void jugarTest() {
		assertEquals(papel.jugar(papel), "Empate");
		assertEquals(papel.jugar(tijera), "La tijera corta el papel, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugar(piedra), "El papel envuelve a la piedra, ¡¡¡PERDÍ!!!");
		assertEquals(papel.jugar(lagarto), "El lagarto se come al papel, ¡¡¡GANÉ!!!");
		assertEquals(papel.jugar(spock), "El papel desaprueba a Spock, ¡¡¡PERDÍ!!!");
		
		assertEquals(piedra.jugar(piedra), "Empate");
		assertEquals(piedra.jugar(papel), "El papel envuelve a la piedra, ¡¡¡GANÉ!!!");
		assertEquals(piedra.jugar(tijera), "La piedra rompe la tijera, ¡¡¡PERDÍ!!!");
		assertEquals(piedra.jugar(lagarto), "La piedra aplasta al lagarto, ¡¡¡PERDÍ!!!");
		assertEquals(piedra.jugar(spock), "Spock pulveriza a la piedra, ¡¡¡GANÉ!!!");
		
		assertEquals(tijera.jugar(tijera), "Empate");
		assertEquals(tijera.jugar(piedra), "La piedra rompe la tijera, ¡¡¡GANÉ!!!");
		assertEquals(tijera.jugar(papel), "La tijera corta el papel, ¡¡¡PERDÍ!!!");
		assertEquals(tijera.jugar(lagarto), "La tijera decapita al lagarto, ¡¡¡PERDÍ!!!");
		assertEquals(tijera.jugar(spock), "Spock rompe la tijera, ¡¡¡GANÉ!!!");
		
		assertEquals(lagarto.jugar(lagarto), "Empate");
		assertEquals(lagarto.jugar(spock), "El lagarto envenena a Spock, ¡¡¡PERDÍ!!!");
		assertEquals(lagarto.jugar(tijera), "La tijera decapita al lagarto, ¡¡¡GANÉ!!!");
		assertEquals(lagarto.jugar(piedra), "La piedra aplasta al lagarto, ¡¡¡GANÉ!!!");
		assertEquals(lagarto.jugar(papel), "El lagarto se come al papel, ¡¡¡PERDÍ!!!");
		
		assertEquals(spock.jugar(spock), "Empate");
		assertEquals(spock.jugar(lagarto), "El lagarto envenena a Spock, ¡¡¡GANÉ!!!");
		assertEquals(spock.jugar(tijera), "Spock rompe la tijera, ¡¡¡PERDÍ!!!");
		assertEquals(spock.jugar(piedra), "Spock pulveriza a la piedra, ¡¡¡PERDÍ!!!");
		assertEquals(spock.jugar(papel), "El papel desaprueba a Spock, ¡¡¡GANÉ!!!");
	}
}
