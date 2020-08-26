import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Task about algorithms

*/
public class SortExample {

    static boolean debug = false;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = {"Task", "Enter", "twenty", "words", "from", "the", "keyboard", "and", "Display", "them",
                "In", "alphabetical", "order", "Each", "word", "Should", "be", "on", "new", "line"}; // this line

        if (!debug) {
            array = new String[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.readLine();
            }
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //write your code here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!isGreaterThan(array[i], array[j + 1])) {
                    String temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(array[i]+"<"+array[j]);
                    for (String n : array) {
                        System.out.print(" " + n);
                    }
                    System.out.println();

                    //j = 0;
                }// else j++;

            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


