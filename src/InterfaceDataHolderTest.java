public class InterfaceDataHolderTest {

    TransferData transferData;
    String data = null;

    public InterfaceDataHolderTest(TransferData transferData) {
        this.transferData = transferData;
        displayData();
    }



    public interface TransferData{
        public String transferData();
    }
    public void displayData(){
        this.data = "\\n " + transferData.transferData() + " inside " + this.getClass();
        System.out.println(transferData.transferData() + "\n inside " + this.getClass());
    }
}
