import java.util.Scanner;
public class Prb_1074 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = s.nextInt();
        String q,w,e,r,t;
        q = "NULL";
        w = "ODD";
        e = "EVEN";
        r = "POSITIVE";
        t = "NEGATIVE";
        if((a > 0) && (a < 10000))
        {
            while(a != 0)
            {
                b = s.nextInt();
                if(b == 0)
                {
                    System.out.printf("%s",q);         
                }
                else{
                    if(b %2 == 0)
                {
                    System.out.printf("%s ",e);
                }
                if(b %2 != 0)
                {
                    System.out.printf("%s ",w);
                }
                if(b > 0)
                {
                    System.out.printf("%s",r);
                }
                if(b < 0)
                {
                    System.out.printf("%s",t);
                }
                }
                System.out.printf("\n");
                a--;
            }
        }
    }
}
