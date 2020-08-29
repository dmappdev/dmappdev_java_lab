import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {


/*
Set of cats

*/


        public static void main(String[] args) {
            Set<Cat> cats = createCats();

            //write your code here. step 3
            for (Cat cat: cats) {
                cats.remove(cat);
                break;
            }

            printCats(cats);
        }

        public static Set<Cat> createCats() {
            //write your code here. step 2
            HashSet<Cat> hashSet = new HashSet();
            hashSet.add(new Cat());
            hashSet.add(new Cat());
            hashSet.add(new Cat());
            return hashSet;
        }

        public static void printCats(Set<Cat> cats) {
            // step 4
            for (Cat cat: cats) {
                System.out.println(cat);
            }
        }

        // step 1
        public static class Cat{}

}
