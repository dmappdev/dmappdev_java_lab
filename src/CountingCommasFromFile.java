import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CountingCommasFromFile {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = bufferedReader.readLine();
        File file = new File("C:\\Users\\denim\\IdeaProjects\\dmappdev_java_lab\\text.txt");
        //String fileName = "C:\Users\denim\IdeaProjects\dmappdev_java_lab\text.txt";
        FileInputStream fileInputStream = new FileInputStream(file);
        int commaCount = 0;
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44) {
                commaCount++;
            }
            System.out.println(commaCount);

            fileInputStream.close();
        }
    }

}
