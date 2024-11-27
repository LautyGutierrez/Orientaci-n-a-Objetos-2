package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ToDoItem {
	private String nombre;
	private Estado estado;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<String> comentarios;
	
	public ToDoItem(String name) {
		nombre = name;
		estado = new Pending();
		start = null;
		end = null;
		comentarios = new ArrayList<String>();
	}
	
	public void setStart(LocalDateTime time) {
		this.start = time;
	}
	
	public void setEnd(LocalDateTime time) {
		this.end = time;
	}
	
	public void setEstado(Estado state) {
		this.estado = state;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void start() {
		estado.start(this);
	}
	
	public void togglePause() {
		estado.togglePause(this);
	}
	
	public void finish() {
		estado.finish(this);
	}
	
	public Duration workedTime() {
		if(this.start == null) throw new RuntimeException("La tarea todavía no inició");
		else if(this.end == null) return Duration.between(start, LocalDateTime.now());
		else return Duration.between(start, end);

	}
	
	public void addComment(String comment) {
		//if(estado.loPuedoAgregar()) comentarios.add(comment);
		estado.addComment(this, comment);
	}

	public void agregarComentario(String comentario) {
		comentarios.add(comentario);
	}

}
