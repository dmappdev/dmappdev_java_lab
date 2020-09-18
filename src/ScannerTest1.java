import java.util.Scanner;

public class ScannerTest1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] a = new int[arraySize];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        while (scan.hasNext()){
            System.out.println(scan.next());
        }

    }

}
