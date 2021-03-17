import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cap = Integer.parseInt(scanner.next());
        boolean day = Boolean.parseBoolean(scanner.next());
        boolean workDay = (cap >= 10 && cap <= 20) && !day;
        boolean weekDay = (cap >= 15 && cap <= 25) && day;

        System.out.println(workDay || weekDay);
        }
    }
