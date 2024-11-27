package ar.edu.unlp.info.oo2.ejercicio_8;



public class Finished implements Estado{
	public Finished() {
		
	}
	
	public void start(ToDoItem item) {
		
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("La tarea está en estado Finished");
	}
	
	public void finish(ToDoItem item) {
		
	}
	
	public boolean loPuedoAgregar() {
		return false;
	}
	
	public void addComment(ToDoItem item, String comment) {
		
	}

}
