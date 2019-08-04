import java.util.Scanner;
public class Prb_1067 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x;
        x = s.nextInt();
        if(x>=1 || x <= 1000)
        {
            int i;
            for(i = 1 ; i < x ; i= i+2)
            System.out.printf("%d\n",i);
            if(x % 2 != 0)
            {
                System.out.printf("%d\n",x);
            }    
        }    
    }
}
