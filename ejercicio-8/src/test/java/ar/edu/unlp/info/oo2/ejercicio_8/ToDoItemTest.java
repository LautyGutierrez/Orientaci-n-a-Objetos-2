package ar.edu.unlp.info.oo2.ejercicio_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ToDoItemTest {
	ToDoItem task1, task2, task3, task4;
	
	@BeforeEach
	void setUp() {
		task1 = new ToDoItem("Tarea 1");
		task2 = new ToDoItem("Tarea 2");
		task3 = new ToDoItem("Tarea 3");
		task4 = new ToDoItem("Tarea 4");
		task2.start();
		task3.start();
		task3.togglePause();
		task4.start();
		task4.finish();
	}
	
	@Test
	public void startTest() {
		assertTrue(task1.getEstado() instanceof Pending);
		task1.start();
		assertTrue(task1.getEstado() instanceof InProgress);
	}
	
	@Test
	public void togglePauseTest() {
		assertTrue(task2.getEstado() instanceof InProgress);
		assertTrue(task3.getEstado() instanceof Paused);
		task2.togglePause();
		task3.togglePause();
		assertTrue(task3.getEstado() instanceof InProgress);
		assertTrue(task2.getEstado() instanceof Paused);
	}
	
	@Test
	public void togglePauseExceptionTest() {
		assertThrows(RuntimeException.class, () -> task1.togglePause());
		assertThrows(RuntimeException.class, () -> task4.togglePause());
	}
	
	@Test
	public void finishTest() {
		task2.finish();
		task3.finish();
		assertTrue(task3.getEstado() instanceof Finished);
		assertTrue(task2.getEstado() instanceof Finished);
	}
	
	@Test
	public void workedTimeTest() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.task1.workedTime();});
		assertEquals("La tarea todavía no inició",exceptionPending.getMessage());
		this.task4.setStart(LocalDateTime.of(2023, 3, 31, 15, 32, 0));
		this.task4.setEnd(LocalDateTime.of(2023, 3, 31, 16, 32, 30));
		assertEquals(3630,this.task4.workedTime().getSeconds());
	}
}
