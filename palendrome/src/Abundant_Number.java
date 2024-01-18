import java.util.Scanner;

public class Abundant_Number
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Abundant Number ");
        int num= inp.nextInt();
        int sum=0;
        for (int i =1 ; i <=num/2;i++)
        {
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum>num)
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("NOT a Abundant Number");
        }
    }
}
