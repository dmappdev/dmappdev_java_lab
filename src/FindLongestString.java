import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindLongestString {

/*
Longest string

*/

    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        FindLongestString.strings = new ArrayList<>();
        int longest_size = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }
        for (int i = 0; i < strings.size(); i++) {
            if (longest_size < strings.get(i).length()) {
                longest_size = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == longest_size) {
                System.out.println(strings.get(i));
            }
        }

    }

}
