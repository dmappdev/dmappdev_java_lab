public class TransferDataMain implements TransferData1.DataTransfer {

    public String data = "initial data";

    public static void main(String[] args) {
        TransferData1.DataTransfer dataTransfer = new TransferDataMain();
        TransferData1 data1 = new TransferData1(dataTransfer);

    }

    @Override
    public String initiateDataTransfer() {
        return this.data;
    }
}
