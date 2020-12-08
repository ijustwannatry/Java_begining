import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = scanner.nextInt(); i > 0; i--) {
            int v = scanner.nextInt();
            if (v % 4 == 0) {
                max = max > v ? max : v;
            }
        }
        System.out.println(max);
    }
}