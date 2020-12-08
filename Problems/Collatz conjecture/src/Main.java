import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        boolean run = true;
        while (run) {
            if (i == 1) {
                System.out.print(i);
                run = false;
            } else {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = i * 3 + 1;
                }
            }
        }
    }
}