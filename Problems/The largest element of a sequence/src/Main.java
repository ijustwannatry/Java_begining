import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;
        int i;
        do {
            i = scanner.nextInt();
            m = m > i ? m : i;
        } while (i != 0);
        System.out.println(m);
    }
}