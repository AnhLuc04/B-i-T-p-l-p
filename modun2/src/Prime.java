import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = prime.nextInt();
        int count = 0, N = 2;
        boolean check = true;
        while (count < number) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
//                    check = false;
//                    break;
                    continue;
                }else {
                    System.out.println(i);
                }
            }
//            if (check)
//            {
//                System.out.println(number);
//            }
//            count++;
//            check=true;
        }
    }
}
