import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;

public class GetMonthByNumber {

/*
Month number

*/

    public static void main(String[] args) throws IOException {
        //write your code here

        List<String> months = Arrays.asList((new DateFormatSymbols()).getMonths());
        String inputMonth;
        int monthNmb = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        inputMonth = bufferedReader.readLine();
        for (int i = 0; i < months.size(); i++) {
            if (months.get(i).equals(inputMonth)) monthNmb = i + 1;
        }
        System.out.println(inputMonth + " is month " + monthNmb);
    }
}
