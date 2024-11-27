package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDateTime;

public class Pending implements Estado{
	public Pending() {
		
	}
	
	public void start(ToDoItem item) {
		item.setEstado(new InProgress());
		item.setStart(LocalDateTime.now());
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("La tarea está en estado Pending");
	}
	
	public void finish(ToDoItem item) {
		
	}
	
	public boolean loPuedoAgregar() {
		return true;
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}
}
