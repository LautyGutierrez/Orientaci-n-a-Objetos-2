package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario agregarusuario(String screenName) {
		Usuario user = null;
		if(!this.estaRegistrado(screenName)) {
			user = new Usuario(screenName);
			this.usuarios.add(user);
		}
		return user;
	}
	
	private boolean estaRegistrado(String screenName) {
		return this.usuarios.stream()
		.anyMatch(user -> user.soyEse(screenName));
	}
	
	public void eliminarUsuario(Usuario user) {
		user.eliminarTweets();
		this.usuarios.remove(user);
	}
}
