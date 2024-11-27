package ar.edu.unlp.info.oo2.ejercicio_1;

public class ReTweet implements Post{
	private Post origen;
	
	public ReTweet(Post origen) {
		this.origen = origen;
	}
	
	public void eliminarPost() {
		this.origen = null;
	}
	
	public String leerPost() {
		return this.origen.leerPost();
	}
	
	public Post getOrigen() {
		return this.origen;
	}
}
