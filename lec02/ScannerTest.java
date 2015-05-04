import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int d = scanner.nextInt();
        System.out.printf("It's %d\n", d);
    }
}
