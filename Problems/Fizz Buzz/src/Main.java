import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int e = scanner.nextInt();
        for (; b <= e; b++) {
            if (b % 3 == 0 || b % 5 == 0) {
                if (b % 3 == 0 && b % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (b % 3 == 0) {
                    System.out.println("Fizz");
                } else if (b % 5 == 0) {
                    System.out.println("Buzz");
                }
            } else {
                System.out.println(b);
            }

        }
    }
}
