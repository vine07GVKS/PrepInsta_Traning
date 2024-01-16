public class Power_of_a_number
{
    public static void main(String[] args) {
        int  base = 15;
        int  expo1 = 2;
        int expo2 = 10;
        int res1, res2;

        // calculates the power
        res1 = (int) Math.pow(base, expo1);
        res2 = (int) Math.pow(base, expo2);
        System.out.println(base + " ^ " + expo1 + " = " + res1 );
        System.out.println(base + " ^ " + expo2 + " = " + res2 );
    }
}
