import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.next());
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Leap");
        } else if (year % 100 == 0) {
            System.out.println("Regular");
        } else {
            System.out.println("Regular");
        }
    }
}