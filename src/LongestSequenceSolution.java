import java.io.*;
import java.util.ArrayList;

public class LongestSequenceSolution {


    /*
    Longest sequence
    1. Create a list of numbers.
    2. Use the keyboard to add 10 numbers to the list.
    3. Display the length of the longest sequence of repeating numbers in the list.

    */
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int new_sequence = 1;
        int total_sequence = 0;
        //int n;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                new_sequence += 1;
            } else new_sequence = 1;

            if (new_sequence > total_sequence) {
                total_sequence = new_sequence;
            }


        }
        System.out.println(total_sequence);
    }

}
