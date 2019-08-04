import java.util.Scanner;
public class Prb_1064 {
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        double a,b,c,d,e,f,h =0;
        int g = 0;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = s.nextDouble();
        f = s.nextDouble();
        if(a >= 0 )
        {
            g++; h += a;
        }if(b >= 0 )
        {
            g++; h += b;
        }
        if(c >= 0 )
        {
            g++; h += c;
        }
        if(d >= 0 )
        {
            g++; h += d;
        }
        if(e >= 0 )
        {
            g++; h += e;
        }
        if(f >= 0 )
        {
            g++; h += f;
        }
        double avg = h/g;
        System.out.printf("%d valores positivos\n",g);
        System.out.printf("%.1f\n",avg);   
    }
}
