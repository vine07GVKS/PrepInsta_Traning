public class Reverse_given_number
{
    public static void main(String[] args) {
        //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
    }
}
