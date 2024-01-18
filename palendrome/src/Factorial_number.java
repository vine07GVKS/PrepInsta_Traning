import java.util.Scanner;

public class Factorial_number
{
    public static void main(String[] args) {
        System.out.println("Enter the Factorial of a number ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        inp.close();
        int factorial = 1;
        for (int  i = 1 ;i <=num;i++){
            factorial*=i;
        }
        System.out.println("' "+num + " ' Factorial of a number is ' "+factorial+" '");
    }
}
