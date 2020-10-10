public class InterfaceDataTransferTest implements InterfaceDataHolderTest.TransferData {


    public String data = "This is data " + this.getClass();
    public InterfaceDataTransferTest interfaceDataTransferTest;

    public static void main(String[] args) {

        InterfaceDataTransferTest mainClass = new InterfaceDataTransferTest();
        InterfaceDataHolderTest SecondaryClass = new InterfaceDataHolderTest(mainClass);


    }

    @Override
    public String transferData() {
        return this.data;
    }


}
