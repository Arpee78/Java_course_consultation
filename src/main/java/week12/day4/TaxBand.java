package week12.day4;

public enum TaxBand {
    A(800), B(600), C(100);

    private int value;

    TaxBand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
