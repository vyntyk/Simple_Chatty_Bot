import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long fact = 1L;
        while(fact <= num){
            for(int i = 1; i <  num; i++){
                fact = fact * i;
                if (fact>num){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}