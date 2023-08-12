package week02.day5;

public class Sultan {

    public static void main(String[] args) {

        Prison prison = new Prison();
        prison.openFreeCells();

        boolean[] openCells = prison.getCells();

        System.out.print("A nyitott cellák sorszámai: ");

        for (int i = 0; i < 100; i++) {
            if (openCells[i]) {
                System.out.print(i + 1 + " ");
            }
        }

    }
}
