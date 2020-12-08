import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean n2BiggerN3 = n2 > n3 && n1 <= n2 && n1 >= n3;
        boolean n3BiggerN2 = n3 > n2 && n1 <= n3 && n1 >= n2;
        boolean equal = n2 == n3 && n1 == n2;
        System.out.println(n2BiggerN3 || n3BiggerN2 || equal);
    }
}