import java.util.HashSet;
import java.util.Set;

public class SetHashSetTest {


/*
Animal set

*/

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static class Cat {

    }

    public static class Dog {

    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here

        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet result = new HashSet();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        HashSet<Object> copy = new HashSet<>(pets);
        for (Cat cat : cats) {
            for (Object object : copy) {
                if (cat.equals(object)) pets.remove(object);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object pet : pets) {
            System.out.println(pet.toString());
        }

    }

    //write your code here
}

