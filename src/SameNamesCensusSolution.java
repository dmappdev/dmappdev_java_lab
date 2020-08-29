import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SameNamesCensusSolution {


/*
Census

*/

        public static HashMap<String, String> createMap() {
            //write your code here
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put("lname " + i, "fname " + (new Random().nextInt(10) + 1));
                //    System.out.println("lname " + i + hashMap.get("lname " + i));
            }
            return hashMap;
        }

        public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
            //write your code here
            int count = 0;
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getValue().equals(name)) count++;
            }
            return count;
        }

        public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
            //write your code here
            int count = 0;
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getKey().equals(lastName)) count++;
            }
            return count;
        }

        public static void main(String[] args) {

        }

}
