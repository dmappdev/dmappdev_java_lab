import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest1 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = 2020, month = 8, day = 30;
        calendar.set(year, month - 1, day);
        System.out.println(calendar.getTime());
        //int dayOfTheWeek = calendar.get(Calendar.DAY_OF_WEEK);
        //Date date = new Date();
        DateFormat df = new SimpleDateFormat("EEEE");
        String dayOfTheWeek = (df.format(calendar.getTime())).toUpperCase();
        System.out.println(dayOfTheWeek);
        //System.out.format("%tMMMMM",dayOfTheWeek);
    }

}
