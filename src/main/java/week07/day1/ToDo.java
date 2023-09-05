package week07.day1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDo {

    private LocalDate date;
    private List<String> toDos;

    public ToDo(LocalDate date, List<String> toDos) {
        this.date = date;
        this.toDos = toDos;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getToDos() {
        return new ArrayList<>(toDos);
    }

//    public void addToDo(String toDo){
//        this.toDos.add(toDo);
//    }
}
