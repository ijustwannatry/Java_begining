import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int i = scanner.nextInt();
            if (i == 0 || sum >= 1000) {
                break;
            } else {
                sum += i;
            }
        }
        System.out.println(sum < 1000 ? sum : sum - 1000);
    }
}