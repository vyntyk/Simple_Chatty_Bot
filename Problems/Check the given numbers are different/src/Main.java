import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int num3 = Integer.parseInt(scanner.next());

        boolean answer = !(num1 == num2 || num2 == num3 || num1 == num3);

        System.out.println(answer);
    }
}