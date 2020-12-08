import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (result <= n) {
            System.out.println(result);
            i++;
            result = i * i;
        }
    }
}