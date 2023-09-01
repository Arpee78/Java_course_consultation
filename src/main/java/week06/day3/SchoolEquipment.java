package week06.day3;

public class SchoolEquipment {


    private int piece;
    private String name;
    private String description;

    public SchoolEquipment(int piece, String name, String description) {
        this.piece = piece;
        this.name = name;
        this.description = description;
    }

    public int getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
