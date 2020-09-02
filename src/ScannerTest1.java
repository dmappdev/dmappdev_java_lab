import java.util.Scanner;

public class ScannerTest1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }

}
