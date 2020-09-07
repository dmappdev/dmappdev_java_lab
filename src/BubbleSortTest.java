import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSortTest {


/*
Task about algorithms

*/

        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] array = new String[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.readLine();
            }

//        String str = "Enter 20 words from the keyboard and display them in alphabetical order. Each word should be on a new line";
//        String[] array = str.split(" ");

            sort(array);

            for (String x : array) {
                System.out.println(x);
            }
        }

        public static void sort(String[] array) {
            //write your code here
//        for (int i = 0; i < array.length - 1; i++) {
//            if (isGreaterThan(array[i], array[i+1])) {
//                String swap = array[i];
//                array[i] =  array[i+1];
//                array[i+1] = swap;
//                i = 0;
//            }
//        }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    String temp = array[i];
                    String s1 = array[i];
                    String s2 = array[j];

                    if (isGreaterThan(s1, s2)) {
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        // String comparison method: 'a' is greater than 'b'
        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }
    }


