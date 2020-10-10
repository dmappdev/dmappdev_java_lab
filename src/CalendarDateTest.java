import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toInstant());
        System.out.println(date.getTime());
        System.out.println(date.toString());
        System.out.println(date.getClass());
        int month;
        GregorianCalendar newDate = new GregorianCalendar();
        month = newDate.get(Calendar.AUGUST);
        System.out.println(month);

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        for (String m: dateFormatSymbols.getMonths()) {
            System.out.println(m);
        }
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MMM d yyyy");
        Date date1 = calendar.getTime();
        dateFormat.format(date1);
        System.out.println(dateFormat.format(date1));
    }
}
