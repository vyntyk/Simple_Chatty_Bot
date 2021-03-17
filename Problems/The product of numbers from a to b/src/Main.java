import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        long proizved = 1;
        for (int i = a; i < b; i++) {
            proizved *=i;
        }
        System.out.println(proizved);
    }
}