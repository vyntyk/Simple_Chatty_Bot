import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String word = scanner.next();
            list.add(word);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }
    }
}