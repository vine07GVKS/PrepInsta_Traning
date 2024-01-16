import java.util.Scanner;

public class Sum_N_Natural_Number
{
    public static void main(String[] args)
    {
        System.out.println("enter the input vale");
        Scanner inp = new Scanner (System.in);
        int num = inp.nextInt();

     //  ------------------------------------------------------------
     // ------------------  using for loop -----------------------

//        int sum = 0;
//        for (int i=0;i<=num;i++){
//          sum+=i;
//            System.out.println(sum);
//        }
//        System.out.println(sum);

     //   ------------------------------------------------------------------------------------------
     // ---------------    using formula =>  Sum = ( Num * ( Num + 1 ) ) / 2  -----------------------

//        while (true){
//            int num = inp.nextInt();
//
//            System.out.println(num*(num+1)/2);
//
//        }


        // ---------------------------------------------------------------------------------------------
        // ---------------    Using Recursion ------------------------------
        // the Using Recursion function to use the to call the method for external class function

        int sum = getSum(num);
        System.out.println(sum);
    }

    static int getSum(int val) {

        if (val ==0 )
            return 0;
        return val + getSum(val-1);
    }
}


