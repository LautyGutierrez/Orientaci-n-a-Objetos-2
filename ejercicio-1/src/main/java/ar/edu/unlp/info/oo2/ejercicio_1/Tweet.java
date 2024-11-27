package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet implements Post{
	private String texto;
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	public void eliminarPost() {
		this.texto = "Publicación no disponible";
	}
	
	public String leerPost() {
		return this.texto;
	}
}
