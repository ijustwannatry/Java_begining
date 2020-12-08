import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();

        if (m < 1) {
            System.out.println("no army");
        } else if (m < 20) {
            System.out.println("pack");
        } else if (m < 250) {
            System.out.println("throng");
        } else if (m < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}