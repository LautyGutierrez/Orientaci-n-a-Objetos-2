package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private List<Post> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Post>();
	}
	
	public boolean soyEse(String name) {
		return this.screenName.equals(name);
	}
	
	public Post publicarTweet(String texto) {
		Post tweet = null;
		if(cumple(texto)) {
			tweet = new Tweet(texto);
			this.tweets.add(tweet);
		}
		return tweet;
	}
	
	public Post publicarReTweet(Post tweet) {
		Post retweet = new ReTweet(tweet);
		this.tweets.add(retweet);
		return retweet;
	}
	
	private boolean cumple(String texto) {
		return texto.length() > 0 && texto.length() <= 280;
	}
	
	public void eliminarTweets() {
		this.tweets.stream()
		.forEach(post -> post.eliminarPost());
		this.tweets.clear();
	}
	
	public int cantidadDeTweet() {
		return this.tweets.size();
	}
}
