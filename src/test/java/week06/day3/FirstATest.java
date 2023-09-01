package week06.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstATest {

    FirstA firstA = new FirstA(Path.of("src/test/resources/schoolequipment.csv"));
    List<SchoolEquipment> schoolEquipments = firstA.getSchoolEquipments();

    @Test
    void testFirstA() {
        assertEquals(2, schoolEquipments.get(1).getPiece());
        assertEquals("radír", firstA.findSchoolEquipmentByName("radír").getName());
        assertEquals(7, schoolEquipments.size());
    }

    @Test
    void testFirstAFail() {
        assertThrows(IllegalStateException.class, () -> new FirstA(Path.of("src/test/resources/schoolequipment_.csv")));
        assertThrows(IllegalArgumentException.class,() -> firstA.findSchoolEquipmentByName("számológép").getName());
    }

}