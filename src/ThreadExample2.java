import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ThreadExample2 {


    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here

        t1.start();
        t1.join();  //wait
        t2.start();
        t2.join(); // main method will be waiting untill its done

        t1.printResult();
        t2.printResult();
    }

    //write your code here
    public static class Read3Strings extends Thread {
        String string = "";

        @Override
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                for (int i = 0; i < 3; i++) {
                    string += bufferedReader.readLine() + " ";
                }
            } catch (Exception e) {
            }
        }

        public void printResult() {
            System.out.println(string);
        }
    }
}


