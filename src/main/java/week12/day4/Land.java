package week12.day4;

public class Land {

    private static final int LIMIT = 10_000;

    private String ownerTaxNumber;
    private String street;
    private String houseNumber;
    private TaxBand taxBand;
    private int area;

    public Land(String ownerTaxNumber, String street, String houseNumber, TaxBand taxBand, int area) {
        this.ownerTaxNumber = ownerTaxNumber;
        this.street = street;
        this.houseNumber = houseNumber;
        this.taxBand = taxBand;
        this.area = area;
    }

    public String getOwnerTaxNumber() {
        return ownerTaxNumber;
    }

    public void setOwnerTaxNumber(String ownerTaxNumber) {
        this.ownerTaxNumber = ownerTaxNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public TaxBand getTaxBand() {
        return taxBand;
    }

    public void setTaxBand(TaxBand taxBand) {
        this.taxBand = taxBand;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getTax() {
        int calculatedTax = area * taxBand.getValue();
        return calculatedTax >= LIMIT ? calculatedTax : 0;
    }
}
