import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StreamInOutTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console = new PrintStream(System.out);
        console.println("Hello");

        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        //Create a stream to write bytes to a file
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            int data = inputStream.read(); // Read the next byte into the data variable
            outputStream.write(data); // and write it to the second stream
        }

        inputStream.close(); //Close both streams. We don't need them any more.
        outputStream.close();
    }

}
