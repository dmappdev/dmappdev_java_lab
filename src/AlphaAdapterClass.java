public class AlphaAdapterClass implements BetaInterface{

    AlphaInterface alphaInterface;

    AlphaAdapterClass(AlphaInterface alphaInterface){
        this.alphaInterface = alphaInterface;
    }

    public static void main(String[] args) {
        AlphaInterface alphaInterface = AlphaClass.getAlphaInterface();
        AlphaAdapterClass alphaAdapterClass = new AlphaAdapterClass(alphaInterface);
        alphaAdapterClass.displayAlarm();
        System.out.println(alphaInterface.toString());
        System.out.println(alphaInterface.hashCode());
    }

    @Override
    public void displayAlarm() {
        this.alphaInterface.displayMsg();
    }
}
