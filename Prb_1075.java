import java.util.Scanner;
public class Prb_1075 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = s.nextInt();
        if(a < 10000)
        {
            for(b = 1; b < 10000 ; b++)
            {
                if(b%a == 2)
                {
                    System.out.printf("%d\n",b);
                }
            }
        }
    }
}
