import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = scanner.nextInt(); i > 0; i--) {
            int v = scanner.nextInt();
            if (v == 5) {
                a++;
            } else if (v == 4) {
                b++;
            } else if (v == 3) {
                c++;
            } else if (v == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
