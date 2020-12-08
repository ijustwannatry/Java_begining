import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long count = 1L;
        for (; a < b; a++) {
            count *= a;
        }
        System.out.println(count);
    }
}