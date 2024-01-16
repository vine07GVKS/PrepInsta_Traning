import java.util.Scanner;

public class Palindrome_Program_in_Java
{
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int number = inp.nextInt();
        inp.close();
        int original = number;
        int check = 0, temp =0 ;
        while (number>0)
        {
            temp = number%10;
            check = (check*10)+temp;
            number = number/10;
        }
        if (original == check)
            System.out.println("In this condition is Palindrome Program ");
        else
            System.out.println("In this is NOT a Palindrome Program");
    }
}
