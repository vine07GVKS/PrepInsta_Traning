import java.util.Scanner;

public class Greatest_Number_Among_Three_Numbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Find Greatest of Three Numbers ");
        System.out.print("Enter the value 1 = ");
        int num1 = inp.nextInt();
        System.out.print("Enter the value 2 = ");
        int num2 = inp.nextInt();
        System.out.print("Enter the value 3 = ");
        int num3 = inp.nextInt();

        // ------------- if-else Statements 1 ------------------------

//        //checking if num1 is greatest
//        if (num1 >= num2 && num1 >= num3)
//            System.out.println (num1 + " is the greatest");
//
//        //checking if num2 is greatest
//        else if (num2 >= num1 && num2 >= num3)
//            System.out.println (num2 + " is the greatest");
//
//        // um3 has to be greatest then if not above
//        else
//            System.out.println (num3 + " is the greatest");



        // ------------- Using math function  ------------------------

//        int temp, result;
//
//        // find the largest b/w num1 and num2 & store in temp
//        temp = Math.max(num1, num2);
//
//        // find the largest b/w temp and num3 & finally printing it
//        result = Math.max(temp, num3);
//        System.out.println (result + " is the greatest");


        // ------------- Using Ternary Operator  ------------------------

        int temp, result;

        // find the largest b/w num1 and num2 & store in temp
        temp = num1>num2 ? num1:num2;

        // find the largest b/w temp and num3 & finally printing it
        result = temp>num3 ? temp:num3;
        System.out.println (result + " is the greatest");


    }
}
