import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int res = m % n * m;

        if (k < n * m && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}