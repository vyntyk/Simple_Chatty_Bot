import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        //put your code here
        int stud1 = scanner.nextInt();
        int stud2 = scanner.nextInt();
        int stud3 = scanner.nextInt();

        int desk = (stud1 % 2 + stud1 / 2) + (stud2 % 2 + stud2 / 2) + (stud3 % 2 + stud3 / 2);

        System.out.println(desk);

    }
}