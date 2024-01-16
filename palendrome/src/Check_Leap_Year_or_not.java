import java.util.Scanner;

public class Check_Leap_Year_or_not {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter the year to find a leap year or NOT = ");
            int year = inp.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                System.out.println (year + " is a Leap Year");

                //not leap year
            else
                System.out.println (year + " is not a Leap Year");
        }
    }
}
