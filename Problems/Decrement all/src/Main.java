import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int num3 = Integer.parseInt(scanner.next());
        int num4 = Integer.parseInt(scanner.next());

        System.out.println(--num1 + " " + --num2 + " " + --num3 + " " + --num4);

    }
}