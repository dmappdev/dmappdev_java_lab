import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutWrapper3 {


/*
Reader wrapper

*/


    public static TestString testString = new TestString();

    public static void main(String[] args) {


        PrintStream saveSystemOut = System.out;

        ByteArrayOutputStream streamBuffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(streamBuffer);
        System.setOut(printStream);

        testString.printSomething();
        String msg = streamBuffer.toString().toUpperCase();

        System.setOut(saveSystemOut);
        System.out.println(msg);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}


