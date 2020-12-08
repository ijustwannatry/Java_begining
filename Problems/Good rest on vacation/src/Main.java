import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int b = scanner.nextInt();
        int total = d * f + t * 2 + (d - 1) * b;
        System.out.println(total);
    }
}