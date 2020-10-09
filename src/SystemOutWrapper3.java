import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutWrapper3 {

    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream savedSysOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myPrintStream = new PrintStream(outputStream);
        System.setOut(myPrintStream);
        testString.printSomething();
        String[] msg = outputStream.toString().split("\\n");
        String modMsg = "";
        for (int i = 0; i < msg.length; i++) {
            modMsg += msg[i] + "\n";
            if (i % 2 == 1) modMsg += "CodeGym - online Java courses\n";
        }

        System.setOut(savedSysOut);
        System.out.println(modMsg);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}



