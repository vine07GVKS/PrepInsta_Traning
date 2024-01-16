import java.util.Scanner;

public class Prime_Number_Program {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int numToCheck = inp.nextInt(); // Change this to check a different number
        if (isPrime(numToCheck)) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
        }
    }

}
