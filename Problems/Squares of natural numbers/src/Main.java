import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(true) {
            int square = i * i;
            if (square <= n) {
                System.out.println(square);
                i++;
            } else {
                break;
            }
        }
    }
}