import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.charAt(0)== 'J'| string.charAt(0)=='j'){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}