import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int s = 0;
        int p = 0;
        for (int i = scanner.nextInt(); i > 0; i--) {
            int v = scanner.nextInt();
            if (v == 0) {
                p++;
            } else if (v == -1) {
                s++;
            } else if (v == 1) {
                b++;
            }
        }
        System.out.println(p + " " + b + " " + s);
    }
}
