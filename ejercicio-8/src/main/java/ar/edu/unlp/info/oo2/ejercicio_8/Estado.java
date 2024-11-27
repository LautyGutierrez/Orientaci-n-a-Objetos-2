package ar.edu.unlp.info.oo2.ejercicio_8;

public interface Estado {
	void start(ToDoItem item);
	public void togglePause(ToDoItem item);
	public void finish(ToDoItem item);
	public void addComment(ToDoItem item, String comment);
	public boolean loPuedoAgregar();

}
