package seedu.address.model.patient;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    private LocalDateTime dateTime;

    public final static DateTimeFormatter DATE_TIME_STORAGE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public final static DateTimeFormatter DATE_TIME_DISPLAY_FORMAT =
            DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");


    public DateTime(){
        this.dateTime = generateCurrentDateTime();
    }

    public DateTime(LocalDateTime localDateTime){
        this.dateTime = localDateTime;
    }

    private LocalDateTime generateCurrentDateTime() {
        return LocalDateTime.now();
    }

    public String displayPrettyFormat(){
        return dateTime.format(DATE_TIME_DISPLAY_FORMAT);
    }

}
