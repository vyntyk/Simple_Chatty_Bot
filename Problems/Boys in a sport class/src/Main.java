import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int boy1 = Integer.parseInt(scanner.next());
        int boy2 = Integer.parseInt(scanner.next());
        int boy3 = Integer.parseInt(scanner.next());

        boolean answer = boy1 >= boy2 && boy2 >= boy3 || boy1 <= boy2 && boy2 <= boy3 ;

        System.out.println(answer);
    }
}