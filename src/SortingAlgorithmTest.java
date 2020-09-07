import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithmTest {



/*
Task about algorithms

*/

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<String>();
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                list.add(s);
            }

            String[] array = list.toArray(new String[list.size()]);
            sort(array);

            for (String x : array) {
                System.out.println(x);
            }
        }

        public static void sort(String[] array) {
            // write your code here

            ArrayList<Integer> integers = new ArrayList<>();
            ArrayList<String> strings = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])){
                    integers.add(Integer.parseInt(array[i]));
                }else {
                    strings.add(array[i]);
                }
            }

            Collections.sort(strings);
            Collections.sort(integers, Collections.reverseOrder());
            for (int i = 0; i < strings.size() - 1; i++) {
                if (isGreaterThan(strings.get(i), strings.get(i+1))) {
                    String swap = strings.get(i);
                    strings.set(i, strings.get(i+1));
                    strings.set(i+i, swap);
                }
            }
//
//        for (String word:strings) {
//            System.out.println(word);
//        }
            //        for (Integer number:integers) {
//            System.out.println(number);
//        }
            int indexI = 0, indexS = 0;
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) array[i] = integers.get(indexI++).toString();
                else array[i] = strings.get(indexS++);
            }
        }

        // String comparison method: 'a' is greater than 'b'
        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }


        // Is the passed string a number?
        public static boolean isNumber(String s) {
            if (s.length() == 0) return false;

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ((i != 0 && c == '-') // The string contains a hyphen
                        || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                        || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
                {
                    return false;
                }
            }
            return true;
        }
    }


