import java.util.Scanner;

public class Strong_Number_Program
{
    public static void main(String[] args) {
        int n,rem,fact,sum=0,temp;
        Scanner inp = new Scanner(System.in);
        n= inp.nextInt();
        temp = n;

        while (n!= 0 )
        {
            rem =n%10;
            fact=1;
             for (int i =1;i<=rem;i++)
             {
                 fact *= i;
             }
             sum += fact;
             n /=10;
        }
        if (temp==sum)
            System.out.println(temp + " is a strong number ");
        else
            System.out.println(temp + " is a not strong number");

    }

}
