import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String line1 = string1.replaceAll(" ", "").trim();
        String line2 = string2.replaceAll(" ","").trim();

        System.out.println(line1.equals(line2));
    }
}