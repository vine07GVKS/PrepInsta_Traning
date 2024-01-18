import java.util.Scanner;

public class Harshad_numbe
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Harshad number ");
        int n = inp.nextInt();
        int Original = n;
        int result = 0;

        while (n>0){
            int pick_last = n%10;
            result+=pick_last;
            n/=10;
        }

        if (n % result==0)
        {
            System.out.println(Original+ "= Harshad number");
        }
        else {
            System.out.println(Original+ "= NOT a Harshad number");
        }
    }
}
