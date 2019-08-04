import java.util.Scanner;
public class Prb_1060 {
    public static void main(String[] args)
    {
        double a,b,c,d,e,f;
        int g = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = s.nextDouble();
        f = s.nextDouble();
        if((a > 0)&& (a!=0))
            g++;
        if((b > 0)&& (b!=0))
            g++;
        if((c > 0)&& (c!=0))
            g++;
        if((d > 0)&& (d!=0))
            g++;
        if((e > 0)&& (e!=0))
            g++;
        if((f > 0)&& (f!=0))
            g++;
        System.out.printf("%d valores positivos\n",g);
    }
}
