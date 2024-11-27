package Ejercicio8_ToDoItem;

import java.time.LocalDateTime;

public class InProgress extends State{
	public InProgress() {
		
	}
	
	public void togglePause(ToDoItem item) {
		item.setEstado(new Paused());
	}
	
	public void finish(ToDoItem item) {
		item.setEstado(new Finished());
		item.setFin(LocalDateTime.now());
	}
}
