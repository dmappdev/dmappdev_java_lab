import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterTest1 {
    public static void main(String[] args) throws Exception
    {
        FileReader reader = new FileReader("c:/data.txt");
        FileWriter writer = new FileWriter("c:/result.txt");

        while (reader.ready()) //as long as there are unread bytes in the input stream
        {
            int data = reader.read(); //Read one character (the char will be widened to an int)
            writer.write(data); //Write one character (the int will be truncated/narrowed to a char)
        }

        //Close the streams after we done using them
        reader.close();
        writer.close();
    }
}
