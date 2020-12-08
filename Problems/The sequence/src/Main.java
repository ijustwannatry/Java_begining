import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        while (scan.hasNext()) {
            int v = scan.nextInt();
            if (v % 4 == 0) {
                m = Math.max(m, v);
            }
        }
        System.out.println(m);
    }
}