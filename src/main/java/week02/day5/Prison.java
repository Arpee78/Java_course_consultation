package week02.day5;

public class Prison {
    private boolean[] cells = new boolean[100];

    public boolean[] getCells() {
        return cells;
    }

    public void openFreeCells() {
        for (int day = 1; day <= 100; day++) {
            for (int cellNr = day; cellNr <= 100; cellNr = cellNr + day ) {
                cells[cellNr-1] = !cells[cellNr-1];
            }
        }
    }
}
