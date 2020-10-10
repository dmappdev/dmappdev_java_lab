import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateFormatting3 {


/*
Working with dates

*/

        public static void main(String[] args) throws Exception {
            System.out.println(isDateOdd("MAY 1 2013"));
            System.out.println(isDateOdd("JANUARY 1 2013"));
        }

        public static boolean isDateOdd(String date) {
            DateFormat df = new SimpleDateFormat("MMMMM d yyyy");
            //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMMM d yyyy");
            //ZonedDateTime zonedDateTime = ZonedDateTime.parse(date,dateTimeFormatter);
            Date date1 = null;
            try{
                date1 = df.parse(date);
            }catch (ParseException e){}

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);

            int daysCount = 0;
            for (int i = 0; i < calendar.get(Calendar.MONTH); i++) {
                daysCount += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                System.out.println(i);
            }
            daysCount += calendar.get(Calendar.DATE);
            System.out.println(daysCount);

            //YearMonth yearMonth = YearMonth.from(zonedDateTime);
            //System.out.println(calendar.get(Calendar.YEAR));


            //LocalDate yearBegins = LocalDate.of(calendar.get(Calendar.YEAR), 1, 1);
            //LocalDate inputDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) , calendar.get(Calendar.DATE));

            //int daysCount = (int) ChronoUnit.DAYS.between(yearBegins, inputDate);


            //int daysCount = (int) ChronoUnit.yearBegins.(yearBegins, inputDate);
            //System.out.println(daysCount);

            if (daysCount%2 != 0) return true;

            //System.out.println(calendar.M);
            //calendar.getActualMaximum();
            //int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            //System.out.println(date1.getMonth());

            return true;
        }

}
