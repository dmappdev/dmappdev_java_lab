import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatSimple {

    public static void main(String[] args) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        String dateInString = "12 23 1987";
        Date birthDate = simpleDateFormat.parse(dateInString);

    }

}
