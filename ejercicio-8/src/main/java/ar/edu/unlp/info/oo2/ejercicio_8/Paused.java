package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDateTime;

public class Paused implements Estado{
	public Paused() {
		
	}
	
	public void start(ToDoItem item) {
		
	}
	
	public void togglePause(ToDoItem item) {
		item.setEstado(new InProgress());
	}
	
	public void finish(ToDoItem item) {
		item.setEstado(new Finished());
		item.setEnd(LocalDateTime.now());
	}
	
	public boolean loPuedoAgregar() {
		return true;
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}

}
