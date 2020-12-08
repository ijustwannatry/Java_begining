import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean run = true;
        while (run) {
            int v = scanner.nextInt();
            if (v != 0) {
                sum += v;
            } else {
                run = false;
            }
        }
        System.out.println(sum);
    }
}