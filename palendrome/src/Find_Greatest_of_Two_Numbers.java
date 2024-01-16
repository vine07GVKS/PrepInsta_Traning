import java.util.Scanner;

public class Find_Greatest_of_Two_Numbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Find Greatest of Two Numbers ");
        System.out.print("Enter the value 1 = ");
        int num1 = inp.nextInt();
        System.out.print("Enter the value 2 = ");
        int num2 = inp.nextInt();
        // ---------------------------------------------------
        // ---------  Using if-else Statements ---------------

//        if (num1 == num2)
//            System.out.println ("both are equal");
//        else if (num1 > num2)
//            System.out.println (num1 + " is greater");
//        else
//            System.out.println (num2 + " is greater");

        // ---------------------------------------------------
        // ---------  Using Ternary Operator ---------------


//        if (num1 == num2)
//            System.out.println ("Both are Equal\n");
//        else
//        {
//            int temp = num1 > num2 ? num1 : num2;
//            System.out.println (temp + " is largest");
//        }

        // ---------------------------------------------------
        // ---------  Using inbuilt max Function ---------------

        if (num1 == num2)
            System.out.println("both are equal");
        else
            System.out.println(Math.max(num1, num2) + " is greater");

    }
}
