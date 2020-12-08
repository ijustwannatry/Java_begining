import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double md = scanner.nextInt();
        double p = scanner.nextInt();
        double kd = scanner.nextInt();

        int i = 0;

        while (md < kd) {
            md = md + md * (p / 100);
            i++;
        }
        System.out.println(i);
    }
}