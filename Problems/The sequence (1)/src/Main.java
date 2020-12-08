import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for (int i = 1, n = scanner.nextInt(); i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count > n) {
                    break;
                } else {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
    }
}