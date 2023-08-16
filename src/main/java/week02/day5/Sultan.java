package week02.day5;

public class Sultan {

    public static void main(String[] args) {

        Prison prison = new Prison();
        prison.openFreeCells();

        boolean[] openCells = prison.getCells();

        System.out.print("A nyitott cellák sorszámai: ");

        for (int cellNr = 1; cellNr <= 100; cellNr++) {

            if (openCells[cellNr-1]) {
                System.out.print(cellNr + " ");
            }
        }

    }
}
