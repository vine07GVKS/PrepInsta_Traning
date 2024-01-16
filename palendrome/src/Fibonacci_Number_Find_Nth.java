public class Fibonacci_Number_Find_Nth
{
    public static int fib (int m){
        if (m<=1){
            return m;
        }
        else
            return fib(m-1)+ fib (m-2);

    }
    public static void main(String[] args) {

        int n= 9;
        if(n<0){
            System.out.println("It's not a Fibonacci Series ");
        }
        else{
            System.out.println(fib(n));
        }
    }
}
