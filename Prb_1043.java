import java.util.Scanner;
public class Prb_1043 {
    public static void main(String[] args)
    {
        double a,b,c,d,e;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        if((a+b > c) && (b+c > a) && (c+a >b))
        {
            d = a+b+c;
            System.out.printf("Perimetro = %.1f\n",d);
        }
        else 
        {
            e = 0.5*(a+b)*c;
            System.out.printf("Area = %.1f\n",e); 
        }
    }
}
