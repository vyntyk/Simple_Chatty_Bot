import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int num3 = Integer.parseInt(scanner.next());
        boolean answer = (num1> 0 && num2 <= 0 && num3 <= 0) || (num1 <= 0 && num2> 0 && num3 <= 0) || (num1 <= 0 && num2 <= 0 && num3> 0);
        System.out.println(answer);
    }
}