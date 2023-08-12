package week02.day5;

public class Prison {

    private boolean[] cells = new boolean[100];

    public boolean[] getCells() {
        return cells;
    }

    public void openFreeCells() {
        int turn = 0;
        for (int i = 0; i < 100; i = i + turn + 1) {
            cells[i] = !cells[i];
            turn++;
        }


    }
}
