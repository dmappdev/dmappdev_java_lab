import java.util.List;

public class WrapperTest1 {


/*
Table

*/


    public class TableInterfaceWrapper implements TableInterface {

        TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}


