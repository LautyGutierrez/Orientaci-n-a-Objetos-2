package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReTweetTest {
	Tweet tweet;
	ReTweet retweet;
	
	@BeforeEach
	void esetUp() {
		tweet = new Tweet("Chau");
		retweet = new ReTweet(tweet);
	}
	
	@Test
	public void eliminarPostTest() {
		retweet.eliminarPost();
		assertNull(retweet.getOrigen());
	}
	
	@Test
	public void leerPostTest() {
		assertEquals(retweet.leerPost(), "Chau");
	}
}
