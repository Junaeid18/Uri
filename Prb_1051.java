import java.util.Scanner;
public class Prb_1051 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double a,b,c,d,e,f,g;
        a = s.nextDouble();
        if(a <= 2000.00)
        {
            System.out.printf("Isento\n");
        }
        else if((a >= 2000.01) && (a <= 3000.00))
        {
            b = a - 2000;
            f = b * 0.08;
            System.out.printf("R$ %.2f\n",f);
        }
        else if((a >= 3000.01) && (a <= 4500.00))
        {
            f = 1000 * 0.08;
            b = a - 3000;
            c = b * 0.18;
            d = f + c ;
            System.out.printf("R$ %.2f\n",d);
        }
        if((a >= 4500.01))
        {
            f = 1000 * 0.08;
            b = 1500 * 0.18;
            e = a - 4500;
            g  = e * 0.28;
            d = g + f + b ;
            System.out.printf("R$ %.2f\n",d);
        }
    }
}
