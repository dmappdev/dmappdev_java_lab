import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortClass1 {

/*
Ascending numbers

*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());

        }
        for (int i = 0; i < numbers.length - 1; ) {
            int swapp_nmb = 0;
            //System.out.println("checking if " + numbers[i] + " > " + numbers[i + 1]);
            if (numbers[i] > numbers[i + 1]) {
                //System.out.println(numbers[i] + " > " + numbers[i + 1]);
                swapp_nmb = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = swapp_nmb;
                i = 0;
            } else i++;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}


