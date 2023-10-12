package week12.day2;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubjectMainTest {

    @Test
    void getTeacherLessonCount() {
        SubjectService scheduleMain = new SubjectService();
        scheduleMain.readSubjectsFromFile(Path.of("src/test/resources/beosztas.txt"));
        int result = scheduleMain.getTeacherLessonCount("Albatrosz Aladin");
        assertEquals(24, result);
    }

    @Test
    void getTeacherLessonCountMissingName() {
        SubjectService scheduleMain = new SubjectService();
        scheduleMain.readSubjectsFromFile(Path.of("src/test/resources/beosztas.txt"));
        CannotFindTeacherException exception = assertThrows(CannotFindTeacherException.class,
                ()-> scheduleMain.getTeacherLessonCount("Albatrosz Aladdddin"));
        assertEquals("Cannot find teacher: Albatrosz Aladdddin", exception.getMessage());
    }
}