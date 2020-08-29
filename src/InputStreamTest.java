import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) throws IOException
    {
        //Put data into a string
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //Wrap the string in a ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //Replace in
        System.setIn(is);

        //Call an ordinary method that doesn't know about our changes
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
