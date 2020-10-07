public class ClassTest1 {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Pet pet = new Pet();

        cat.voice();
        pet = cat;
        pet.voice();
        cat.isFuzzy();

        dog.voice();

        Running running = new Cat();
        running.getRunningSpeed();
        System.out.println(running instanceof Cat);
        running = dog;
        running.getRunningSpeed();
        System.out.println(running instanceof Cat);

        dog.getName();
        cat.getName();

//        Animal animal = new  Animal();
//        System.out.println(animal instanceof Cat);
//        System.out.println(cat instanceof Animal);
//
//        Dog dog1 = (Dog) running;
//        dog1.voice();
//        dog1.getRunningSpeed();
//        Cat cat1 = (Cat) running;
//        cat1.voice();
//        cat1.getRunningSpeed();
    }


    static class Pet extends Animal {
        public void getName(){
            System.out.println("Petty Pet");
        }
        public void voice() {
            System.out.println(this.toString());
        }
    }

    static class Animal {
        public void voice() {
            System.out.println(this.toString());
        }
    }

    static class Dog extends Pet implements Running {
        public void voice() {
            System.out.println(this.toString());
        }

        @Override
        public void getRunningSpeed() {
            System.out.println("slow");
        }

        @Override
        public void getName() {
            System.out.println("Doggy Dog");
        }
    }

    static class Cat extends Pet implements Running {
        public void voice() {
            System.out.println(this.toString());
        }
        public boolean isFuzzy(){
            return true;
        }


        @Override
        public void getRunningSpeed() {
            System.out.println("fast");
        }
    }

    interface Running {
//        public String runningSpeed = "fast";
        public void getRunningSpeed();
        public void getName();
    }
}
