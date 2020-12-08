import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgeNumbers = scanner.nextInt();

        for (int i = 1; i <= bridgeNumbers; i++) {
            int bridgeHeight = scanner.nextInt();
            if (i == bridgeNumbers && busHeight < bridgeHeight) {
                System.out.println("Will not crash");
            }
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
    }
}