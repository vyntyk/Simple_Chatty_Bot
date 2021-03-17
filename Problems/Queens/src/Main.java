import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.next());
        int y1 = Integer.parseInt(scanner.next());
        int x2 = Integer.parseInt(scanner.next());
        int y2 = Integer.parseInt(scanner.next());
        if (x1 == x2 || y1 == y2 ||(Math.abs(x1 - x2) == Math.abs(y1 - y2))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}