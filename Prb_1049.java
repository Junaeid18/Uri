import java.util.Scanner;
class Prb_1049 {
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        String a,b,c;
        a = s.next();
        b = s.next();
        c = s.next();
        if("vertebrado".equals(a))
        {
            if("ave".equals(b))
            {
                if("carnivoro".equals(c))
                    System.out.printf("aguia\n");
                else
                    System.out.printf("pomba\n");
            }
            else
            {
                if("onivoro".equals(c))
                {
                    System.out.printf("homem\n");
                }
                else
                    System.out.printf("vaca\n");
            }
        }
        else
        {
            if("anelideo".equals(b))
            {
                if("onivoro".equals(c))
                    System.out.printf("minhoca\n");
                else 
                    System.out.printf("sanguessuga\n");
            }
            else
            {
                if("hematofago".equals(c))
                    System.out.printf("pulga\n");
                else
                    System.out.printf("lagarta\n");
            }
        }
    }
}
