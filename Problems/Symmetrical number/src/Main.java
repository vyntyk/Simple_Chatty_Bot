import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());

        int a = num / 1000;
        int b = num / 100 % 10;
        int c = num / 10 % 10;
        int d = num % 10;
        if (a == d && b == c) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}