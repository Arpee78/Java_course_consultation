package week08.day3;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private String code;

    public FrontOfStageTicket(String band, LocalDateTime time, int price, String code) {
        super(band, time, Math.round(price * 1.3f));
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public LocalTime entryTime() {
        return super.getStartTime().toLocalTime().minusHours(2);
    }
}
