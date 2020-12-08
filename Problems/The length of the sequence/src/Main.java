import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int m = 0;
        while (i != 0) {
            m++;
            i = scanner.nextInt();
        }
        System.out.println(m);

    }
}