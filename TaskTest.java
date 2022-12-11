import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TaskTest {

@Test
void testTask() {
	Task task = new Task("1234567890", "Michael Scott Region", "This is going to be the description and it is goin");
	assertTrue(task.getTaskID().equals("1234567890"));
	assertTrue(task.getTaskName().equals("Michael Scott Region"));
	assertTrue(task.getTaskDes().equals("This is going to be the description and it is goin"));
	}

@Test
void testTaskIDToLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("12345678901", "Michael Scott Region", "This is going to be the description and it is goin");
	});	}

@Test
void testTaskIDNull() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task(null, "Michael Scott Region", "This is going to be the description and it is goin");
	});	}

@Test
void testTaskNameToLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("12345678901", "Michael Scott Regional Manager", "This is going to be the description and it is goin");
	});	}

@Test
void testTaskNameNull() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("12345678901", null, "This is going to be the description and it is goin");
	});	}

@Test
void testTaskDesToLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("12345678901", "Michael Scott Regional Manager", "This is going to be the description and it is going to be long!");
	});	}

@Test
void testTaskDesNull() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("12345678901", "Michael Scott Regional Manager",null);
	});	}

}