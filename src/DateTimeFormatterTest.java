import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.time.format.*;


public class DateTimeFormatterTest {

    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            String input = "Mon Mar 14 16:02:37 GMT 2011";
            DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM d HH:mm:ss z uuuu" );
            ZonedDateTime zdt = ZonedDateTime.parse( input , f );
            YearMonth ym = YearMonth.from( zdt );
            int year = ym.getYear();
            int month = ym.getMonthValue();

            System.out.println( "input: " + input );
            System.out.println( "zdt: " + zdt );
            System.out.println( "ym: " + ym );
        }
}
