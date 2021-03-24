import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        double P = sc.nextDouble();
        double K = sc.nextDouble();
        int year = 0;

        while (M<K) {
            M = M + M * P / 100;
            year++;
        }
        System.out.println(year);
    }
}