import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        boolean w = scanner.nextBoolean();
        System.out.println(w && (p >= 15 && p <= 25)
                || !w && (p >= 10 && p <= 20));
    }
}