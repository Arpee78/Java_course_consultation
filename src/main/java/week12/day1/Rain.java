package week12.day1;

import java.time.LocalDate;

public class Rain {

    private int quantity;
    private LocalDate date;

    public Rain(int quantity, LocalDate date) {
        this.quantity = quantity;
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }


}
