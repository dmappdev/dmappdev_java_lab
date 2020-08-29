import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DateFormatting2 {


/*
Kind Emma and the summer holidays

*/

        public static HashMap<String, Date> createMap() throws ParseException {
            DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            HashMap<String, Date> map = new HashMap<String, Date>();
            map.put("Stallone", df.parse("JUNE 1 1980"));

            //write your code here
            map.put("Stallone2", df.parse("JUNE 15 1980"));
            map.put("Stallone3", df.parse("JUNE 27 1980"));
            map.put("Stallone4", df.parse("JULY 1 1980"));
            map.put("Stallone5", df.parse("JULY 15 1980"));
            map.put("Stallone6", df.parse("SEPTEMBER 1 1980"));
            map.put("Stallone7", df.parse("NOVEMBER 1 1980"));
            map.put("Stallone8", df.parse("MAY 1 1980"));
            map.put("Stallone9", df.parse("DECEMBER 1 1980"));
            map.put("Stallone10", df.parse("JUNE 12 1980"));
            return map;
        }

        public static void removeAllSummerPeople(HashMap<String, Date> map) {
            //write your code here
            HashMap<String, Date> copy = new HashMap<>(map);
            for (Map.Entry<String, Date> pair : copy.entrySet()) {
                if (pair.getValue().getMonth() < 8 && pair.getValue().getMonth() > 4)
                    map.remove(pair.getKey());
            }
/*
        for (Map.Entry<String, Calendar> iterate : copy.entrySet()) {
            if (iterate.getValue().equals(Calendar.JUNE)) {
                map.remove(iterate.getKey());
            }
            if (iterate.getValue().equals(Calendar.JULY)) {
                map.remove(iterate.getKey());
            }
            if (iterate.getValue().equals(Calendar.AUGUST)) {
                map.remove(iterate.getKey());
            }
*/

        }

        public static void main(String[] args) {
        }

}
