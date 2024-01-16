import java.util.Scanner;

public class Armstrong_Numbers_between_Two_Intervals
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        FindArmstrong_Number(a,b);

    }
    static void FindArmstrong_Number(int a, int b ){
        for (int i = a; i<=b; i++){
            int number = i;

            int temp = 0;
            int check =0;
            while (number>0){
                 temp= number%10;
                check = check + (temp*temp*temp);
                number = number/10;
            }
            if ( check == i)
                System.out.println(" YES this is a Armstrong Number = " +   check );
//            else
//                System.out.println(" NO this is NOT a Armstrong Number = " + check);
        }
    }

}
