package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario u1;
	private Usuario u2;
	
	@BeforeEach
	public void setUp() {
		this.u1 = new Usuario("Gerardo");
		this.u2 = new Usuario("Josefina");
	}
	
	@Test
	public void testTwittear() {
		assertNull(u1.publicarTweet(""));
		Post tweet = u2.publicarTweet("Twitteando");
		assertNotNull(tweet);
		assertEquals(1, u2.cantidadDeTweet());
		assertEquals("Twitteando", tweet.leerPost());
	}
	
	@Test
	public void testRetwittear() {
		assertNotNull(u2.publicarReTweet(new Tweet("Twitter ahora se llama X")));
		Tweet t1 = new Tweet("Hola Mundo!");
		assertEquals("Hola Mundo!", u1.publicarReTweet(t1).leerPost());
		Post t2 = u1.publicarTweet("Segundo tweet");
		assertEquals(2, u1.cantidadDeTweet());
		Post r = u2.publicarReTweet(t2);
		assertEquals("Segundo tweet", u1.publicarReTweet(r).leerPost());
	}
	
	@Test
	public void testEliminarTweets() {
		u1.publicarTweet("Probando");
		Tweet t1 = new Tweet("Que onda");
		ReTweet r1 = new ReTweet(t1);
		u1.publicarReTweet(r1);
		assertEquals(2, u1.cantidadDeTweet());
		u1.eliminarTweets();
		assertEquals(0, u1.cantidadDeTweet());
		assertEquals("Que onda", r1.leerPost());
	}
}
