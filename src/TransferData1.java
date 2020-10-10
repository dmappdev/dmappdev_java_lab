public class TransferData1 {

    public String data = null;
    DataTransfer dataTransfer;

    public TransferData1(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
        this.data = dataTransfer.initiateDataTransfer();
        displayData();
    }

    public void displayData() {
        System.out.println(this.data);
    }

    public interface DataTransfer {

        String initiateDataTransfer();

    }
}
