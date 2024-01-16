import java.util.Scanner;

public class Perfect_Number
{
    public static void main(String[] args) {

    //perfect number have sum of factors equal to the same number itself
    // eg: 6 factors are 1+2+3 =6-- perfect Number

        System.out.println("Enter the number to check");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt ();
        int sum = 0;
    //condition for finding factors
        for(int i=1;i<=num/2; i++) {

            // why num divided by 2 means,
            // because num value not more than from half of num value  so ==>> This is a strong number,
            // if in case more than half means this not a strong number

            if (num%i == 0) {
                sum += i;
            }
        }
        if(sum==num)
            System.out.println("it is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
}
