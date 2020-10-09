import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutWrapper4 {

        public static TestString testString = new TestString();

        public static void main(String[] args) {
            PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream myStream = new PrintStream(outputStream);

            System.setOut(myStream);
            testString.printSomething();
            String[] data = outputStream.toString().split(" ");

            int arg1 = Integer.parseInt(data[0]);
            String operator = data[1];
            int arg2 = Integer.parseInt(data[2]);
            int result = 0;
            switch (operator){
                case "+" : result = arg1 + arg2;
                    break;
                case "*" : result = arg1 * arg2;
                    break;
                case "-" : result = arg1 - arg2;
            }
            System.setOut(consoleStream);
            String outputString = String.format("%d %s %d = %d",
                    arg1, operator, arg2, result);
            System.out.println(outputString);
        }

        public static class TestString {
            public void printSomething() {
                System.out.println("3 + 6 = ");
            }
        }
    }



