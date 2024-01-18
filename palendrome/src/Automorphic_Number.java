import java.util.Scanner;

public class Automorphic_Number
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the Automorphic Number checking ");
        int N= inp.nextInt();
        if (AutomorphicNumber(N))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("NOT a Automorphic Number");
        }

    }
static boolean AutomorphicNumber(int N )
    {
        int sq = N*N;
        while (N>0){
            if (N%10 != sq%10){
                return false;
            }
            else {
                N/=10;
                sq/=10;
            }
        }
        return true;
    }


}
