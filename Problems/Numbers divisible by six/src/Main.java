import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (; n > 0; n--) {
            int v = scanner.nextInt();
            if (v % 6 == 0) {
                sum += v;
            }
        }
        System.out.println(sum);
    }
}