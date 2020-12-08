import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int asc = 0;
        int des = 0;
        while (true) {
            int p = i;
            i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                if (p < i) {
                    asc++;
                } else if (p > i) {
                    des++;
                }
            }
        }
        System.out.println(asc == 0 || des == 0);
    }
}