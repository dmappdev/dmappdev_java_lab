import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadExceptionTask {


    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        while (true) {
            fileName = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);

            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                throw new DownloadException();
            } else {
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                }
                fileInputStream.close();
            }
        }
    }

    public static class DownloadException extends Exception {

    }

}
