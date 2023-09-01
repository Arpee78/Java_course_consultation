package week06.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FirstA {

    private List<SchoolEquipment> schoolEquipments = new ArrayList<>();

    public FirstA(Path path) {
        loadEquipmentsFromFile(path);
    }

    private void loadEquipmentsFromFile(Path path) {
        try {
            loadEquipment(Files.readAllLines(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private void loadEquipment(List<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(";");
            int pieces = Integer.parseInt(parts[0]);
            SchoolEquipment schoolEquipment = new SchoolEquipment(pieces, parts[1], parts[2]);
            schoolEquipments.add(schoolEquipment);
        }
    }

    public List<SchoolEquipment> getSchoolEquipments() {
        return new ArrayList<>(schoolEquipments);
    }

    public SchoolEquipment findSchoolEquipmentByName(String name) {
        for (SchoolEquipment s : schoolEquipments) {
            if (s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Cannot find equipment with this name: " + name);
    }

}
