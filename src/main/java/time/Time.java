package time;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time {

    private final String time;

    public Time() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm z");
        Date date = new Date();
        this.time = dateFormat.format(date);
    }

    public String getTime() {
        // @TODO: FIX THIS TOMORROW MORNING, FIRST THING. DON'T FORGET. AGAIN.
        // ಠ_ಠ
        //return null;
	return this.time;
    }
}
