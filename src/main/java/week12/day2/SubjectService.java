package week12.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<Subject> subjects = new ArrayList<>();

    public void readSubjectsFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.readLine();

            String name;
            while ((name = reader.readLine()) != null) {
                subjects.add(processBlock(name, reader));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private Subject processBlock(String name, BufferedReader reader) throws IOException {
        String subjectName = reader.readLine();
        String group = reader.readLine();
        int numberOfLessons = Integer.parseInt(reader.readLine());
        return new Subject(name, subjectName, group, numberOfLessons);
    }

    public int getTeacherLessonCount(String name) {
        int sum = 0;
        for (Subject s : subjects) {
            if (s.getTeacher().equals(name)) {
                sum += s.getNumberOfLessons();
            }
        }
        if (sum == 0) {
            throw new CannotFindTeacherException("Cannot find teacher: "+ name);
        }
        return sum;

    }


}
