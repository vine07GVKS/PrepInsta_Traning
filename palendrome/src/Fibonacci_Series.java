import java.util.Scanner;

public class Fibonacci_Series
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of the series number ");
        int LengthOfSeries = inp.nextInt();
        int num1=0;
        int num2=1;
        int nextnum;
        inp.close();
        for (int i = 0; i< LengthOfSeries; i++){
            System.out.print( num1+" ");
            nextnum = num1 + num2;
            num1 = num2;
            num2 = nextnum;

        }
    }

}
