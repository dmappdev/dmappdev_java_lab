import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

public class StreamInOutTest2 {

    public static void main(String[] args) throws Exception {

        //URL path = StreamInOutTest2.class.getResource("text.txt");
        //File file = new File(path.getFile());
        FileInputStream fileInputStream = new FileInputStream("text.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("result.txt");
        } catch (FileNotFoundException e) {
            System.out.printf("no such file");
        }
        byte[] buffer = new byte[1000];
        System.out.println(fileInputStream.available());
        while(fileInputStream.available() > 0){
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer, 0, count);
            System.out.println(count);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }

}
