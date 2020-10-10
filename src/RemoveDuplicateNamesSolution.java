import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RemoveDuplicateNamesSolution {


/*
We don't need repeats

*/

        public static HashMap<String, String> createMap() {
            //write your code here
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put("lname " + i, "fname " + (new Random().nextInt(10) +1));
                //    System.out.println("lname " + i + hashMap.get("lname " + i));
            }
            return hashMap;
        }

        public static void removeFirstNameDuplicates(Map<String, String> map) {
            //write your code here
            HashMap<String, String> copy = new HashMap<>(map);
            for (Map.Entry<String, String> pair: copy.entrySet()) {
                for (Map.Entry<String, String> pair2: copy.entrySet()) {
                    if (pair.getValue().equals(pair2.getValue()))
                        if (!pair.getKey().equals(pair2.getKey())) removeItemFromMapByValue(map, pair.getKey());
                }
            }
            //for (Map.Entry<String, String> pair : map.entrySet()) {
            //    System.out.println(pair.getKey() + " " + pair.getValue());
            //}

        }

        public static void removeItemFromMapByValue(Map<String, String> map, String value) {
            //HashMap<String, String> copy = new HashMap<String, String>(map);
            map.remove(value);
        /*
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                System.out.format("removing %s ", map.get(pair.getKey()));
            //System.out.println();
                map.remove(pair.getKey());
        }
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }*/
        }

        public static void main(String[] args) {
            //removeFirstNameDuplicates(createMap());
        }

}
