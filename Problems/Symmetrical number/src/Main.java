import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int d1 = i / 1000;
        int d2 = (i / 100) % 10;
        int d3 = (i % 100) / 10;
        int d4 = i % 10;

        if (d1 == d4 && d2 == d3) {
            System.out.println(1);
        } else {
            System.out.println(d1 + d2 + d3 + d4);
        }
    }
}