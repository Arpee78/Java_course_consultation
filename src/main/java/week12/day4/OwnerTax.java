package week12.day4;

import java.util.Objects;

public class OwnerTax {

    private String taxNumber;
    private int fullTax;

    public OwnerTax(String taxNumber) {
        this(taxNumber, 0);
    }

    public OwnerTax(String taxNumber, int fullTax) {
        this.taxNumber = taxNumber;
        this.fullTax = fullTax;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public int getFullTax() {
        return fullTax;
    }

    public void increaseTax(int amount) {
        this.fullTax += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerTax ownerTax = (OwnerTax) o;

        return Objects.equals(taxNumber, ownerTax.taxNumber);
    }

    @Override
    public int hashCode() {
        return taxNumber != null ? taxNumber.hashCode() : 0;
    }
}
