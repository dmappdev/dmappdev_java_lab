public class ClassAbstractTest1a extends ClassAbstractTest1{

    public static void main(String[] args) {

        ClassAbstractTest1 test1 = new ClassAbstractTest1a();
        test1.printSomething();
        ClassAbstractTest1a test2 = (ClassAbstractTest1a) test1;
        test2.printSomething1();
        test2.printSomething();
        test1 = test2;


    }
    public void printSomething1(){
        System.out.println("hello " + this.getClass().getName().toUpperCase());
    }

}
