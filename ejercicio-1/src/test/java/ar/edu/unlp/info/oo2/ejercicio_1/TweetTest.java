package ar.edu.unlp.info.oo2.ejercicio_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TweetTest {
	Tweet tweet;
	
	@BeforeEach
	void setUp() {
		tweet = new Tweet("Hola");
	}
	
	@Test
	public void eliminarPostTest() {
		tweet.eliminarPost();
		assertTrue(tweet.leerPost().equals("Publicación no disponible"));
	}
	
	@Test
	public void leerPostTest() {
		assertEquals(tweet.leerPost(), "Hola");
	}
}
