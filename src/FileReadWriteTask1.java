import java.io.*;
import java.util.ArrayList;

public class FileReadWriteTask1 {

/*
Picking out numbers

*/

    public static void main(String[] args) throws IOException {
//        InputStream savedIS = System.in;
//        String data = "12 text var2 14 8v 1";
//        InputStream is = new ByteArrayInputStream(data.getBytes());
//        System.setIn(is);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameToReadFrom = reader.readLine();
        String fileNameToWriteTo = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileNameToReadFrom));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (reader.ready()) {

            String[] lineData = reader.readLine().split(" ");
            for (String unit : lineData) {
                if (unit.matches("-?\\d+")) numbers.add(Integer.parseInt(unit));
            }
        }
        reader.close();
//        System.setIn(savedIS);

//        for (Integer nmb:numbers) {
//            System.out.println(nmb);
//        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameToWriteTo));
        for (Integer nmb : numbers) {
            writer.write(nmb + " ");
//            System.out.println(nmb);
        }
        writer.close();
    }
}



