import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();

        System.out.println(--i1 + " " + --i2 + " " + --i3 + " " + --i4);
    }
}