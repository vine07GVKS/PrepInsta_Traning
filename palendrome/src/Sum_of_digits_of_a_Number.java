public class Sum_of_digits_of_a_Number
{
    public static void main(String[] args) {
        int num = 12345, sum = 0;

        //loop to find sum of digits
        while(num!=0){
            sum += num % 10;  // 1st = 5, 2nd = 4, 3rd = 3, 4th = 2, 5th = 1
            num = num / 10;   // 1st = 1234.5 so int value stored the 1234 in the ' num ' <= variable name
        }

        //output
        System.out.println ("Sum of digits : " + sum);
    }
}
