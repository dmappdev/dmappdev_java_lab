import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatting1 {

/*
What's today's date?

*/

    public static boolean debug = false;

    public static void main(String[] args) throws Exception {
        //write your code here
        String inputDate = "";
        if (debug) inputDate = "2013-08-18";
        Date date = new Date();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (!debug) inputDate = bufferedReader.readLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(inputDate);
        } catch (Exception e) {
        }
        simpleDateFormat.applyPattern("MMM dd, yyyy");
        String dateDisplay = simpleDateFormat.format(date);
        System.out.println(dateDisplay.toUpperCase());

    }

}
