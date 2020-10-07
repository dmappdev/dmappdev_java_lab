import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateFormatting4 {

    public static void main(String[] args) {
        Scanner fileScanner = new Scanner(System.in);
        String data = fileScanner.nextLine();
        String[] parsedData = data.split(" ");
        String fName = parsedData[0];
        String mName = parsedData[1];
        String lName = parsedData[2];

        DateFormat df = new SimpleDateFormat("MM dd yyyy");
        Date birthday = null;
        try {
            birthday = df.parse(parsedData[3] + " " + parsedData[4] +
                    " " + parsedData[5]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
