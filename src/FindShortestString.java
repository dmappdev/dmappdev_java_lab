import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindShortestString {

/*
Expressing ourselves more concisely

*/

    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        //ArrayList<String> short_list = new ArrayList<>();
        //String short_str;
        int smallest_size = Integer.MAX_VALUE;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            smallest_size = (Math.min(smallest_size, list.get(i).length()));
        }
        //short_str = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == smallest_size) System.out.println(list.get(i));
        }
    }

}
