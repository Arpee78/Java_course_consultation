package week07.day1;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void createToDoListFormFile() {
        ToDoList toDoList = new ToDoList();
        toDoList.createToDoListFormFile(Path.of("src/main/resources/todos.txt"));

        assertEquals(4, toDoList.getToDoList().size());
        assertEquals("cooking", toDoList.getToDoList().get(1).getToDos().get(0));
        assertEquals(LocalDate.parse("2022-09-07"), toDoList.getToDoList().get(2).getDate());
    }
}