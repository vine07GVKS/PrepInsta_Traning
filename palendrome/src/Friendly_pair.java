import java.util.Scanner;

public class Friendly_pair
{
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        System.out.println("enter 1st value = ");
        int num1 = inp.nextInt();
        System.out.println("enter 2nd value = ");
        int num2 = inp.nextInt();

        int sum1 = getDivisorsSum (num1);
        int sum2 = getDivisorsSum (num2);

        if (sum1 / num1 == sum2 / num2)
            System.out.println (num1 + " & " + num2 + " are friendly pairs");
        else
            System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }

    static int getDivisorsSum (int num)
    {

        int sum = 0;

        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}