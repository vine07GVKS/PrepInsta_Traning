import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int original = number;
        int check =0 , temp = 0;
        inp.close();

        while (number>0){
            temp = number%10;
            check = check + (temp*temp*temp);
            number = number/10;
        }
        if (check == original)
            System.out.println(" YES this is a Armstrong Number = " + original );
        else
            System.out.println(" NO this is NOT a Armstrong Number = " + original);
    }
}
