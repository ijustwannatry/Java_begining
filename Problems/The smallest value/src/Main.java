import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long in = scanner.nextLong();
        long res = 1;
        int n = 0;
        while (res <= in) {
            n++;
            res *= n;
        }
        System.out.println(n);
    }
}