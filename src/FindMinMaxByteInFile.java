import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FindMinMaxByteInFile {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        int min = Byte.MAX_VALUE;
        while (inputStream.available() > 0) {
            int inputByte = inputStream.read();
            if (min > inputByte) min = inputByte;
        }
        inputStream.close();
        System.out.println(min);
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String fileName2 = bufferedReader2.readLine();
        bufferedReader2.close();
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        int max = Integer.MIN_VALUE;
        while (inputStream2.available() > 0){
            int inputByte = inputStream2.read();
            if (max < inputByte) max = inputByte;
        }
        inputStream2.close();
        System.out.println(max);

    }

}
