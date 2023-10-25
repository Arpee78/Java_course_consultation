package week13.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassNoteBook {

    private Map<Long, List<Integer>> notebook = new HashMap<>();

    public Map<Long, List<Integer>> getNotebook() {
        return new HashMap<>(notebook);
    }

    public void addStudent(Student student) {
        notebook.put(student.getId(), new ArrayList<>());
    }

    public void addMark(Long id, int mark) {
        if (!notebook.containsKey(id)){
            throw new IllegalArgumentException("Id not exists: " + id);
        }
        notebook.get(id).add(mark);
    }
}
