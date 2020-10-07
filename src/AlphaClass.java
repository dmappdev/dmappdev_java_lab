public class AlphaClass implements AlphaInterface{

    public static AlphaInterface getAlphaInterface(){
        return new AlphaClass();
    }
    @Override
    public void displayMsg() {
        System.out.println("This is AlphaClass");
    }
}
