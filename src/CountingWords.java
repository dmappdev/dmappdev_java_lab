import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingWords {

    /*
    Counting words

    */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int counter = 0;
        while (fileReader.ready()) {
            String[] lineData = fileReader.readLine().split("\\W");
            for (String dataUnit : lineData) {
                if (dataUnit.equals("world")) counter++;
            }
        }
        fileReader.close();
        System.out.println(counter);
    }
}


