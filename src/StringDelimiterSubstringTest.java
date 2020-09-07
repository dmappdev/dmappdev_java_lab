import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDelimiterSubstringTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here
        String delimit = " ";
        String[] words = s.split(delimit);

        for (String word : words) {
            String output = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(output);
        }

    }
}

