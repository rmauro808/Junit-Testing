import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TaskServiceTest {

	@Test
	void testServiceTask() {
		Task task = new Task("1234567890", "Michael Scott Region", "This is going to be the description and it is goin");
		assertTrue(task.getTaskID().equals("1234567890"));
		assertTrue(task.getTaskName().equals("Michael Scott Region"));
		assertTrue(task.getTaskDes().equals("This is going to be the description and it is goin"));
		}
	
	@Test
	void testAddTask() {
		TaskService taskService = new TaskService();
		Task testAdd = new Task("1234567890", "Michael Scott Region", "This is going to be the description and it is goin");
		assertEquals(true, taskService.addTask(testAdd));
	}

	
	@Test
	public void testDeleteTask() {
		TaskService taskService = new TaskService();
		assertEquals(false, taskService.deleteTask("1234567890"));
	}
	
	@Test
	public void testUpdateTask() {
		TaskService taskService = new TaskService();
		Task t1 = new Task("1234567890", "Michael Scott Region", "This is going to be the description and it is goin");
		
		taskService.addTask(t1);
		assertEquals(false, taskService.updateTask("1657984652", "Jim Halpart task", "This is going to be the new descprtion."));
	}
	
}
