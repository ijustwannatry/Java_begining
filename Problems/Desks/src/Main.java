import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = l / 2 + l % 2 + n / 2 + n % 2 + m / 2 + m % 2;
        System.out.println(i);
    }
}
