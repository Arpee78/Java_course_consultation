package week07.day1;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private List<ToDo> toDoList = new ArrayList<>();

    public List<ToDo> getToDoList() {
        return new ArrayList<>(toDoList);
    }

    public void createToDoListFormFile(Path path) {
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                makeToDo(parts[0], parts[1]);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file: " + path, ioe);
        }
    }

    private void makeToDo(String dateStr, String tasks) {
        LocalDate date = LocalDate.parse(dateStr);
        String[] temp = tasks.split(",");
        ToDo toDo = new ToDo(date, new ArrayList<>(Arrays.asList(temp)));
        toDoList.add(toDo);
    }

}
