import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class WrapperTest2 {
    // reader is an interface
    Reader component;

    // To use this we need an actual reader, e.g. FileReader, InputStreamReader etc
    public WrapperTest2(Reader component) {
        this.component = component;
    }

    // pass off all the work to the 'component'
    public int read() throws IOException {
        System.out.println("Reading an int");
        return component.read();
    }

    public boolean ready() throws IOException {
        System.out.println("Checking if component is ready");
        return component.ready();
    }

    public int read(char[] cbuf, int off, int len) throws IOException {
        System.out.println("Something");
        return component.read(cbuf, off, len);
    }


    public void close() throws IOException {
        System.out.println("Now CLosing");
        component.close();
    }

    // used in code:
    public static void main(String[] args) throws Exception {
        FileReader temp = new FileReader("C:\\pathToSomeFile");
        WrapperTest2 myReader = new WrapperTest2(temp);
        while (myReader.ready()) {
            System.out.println(myReader.read());
        }
        myReader.close();
    }
}


