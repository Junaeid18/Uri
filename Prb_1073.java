import java.util.Scanner;
public class Prb_1073 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,n,result,c=2;
        n = s.nextInt();
        if((n> 5) && (n < 2000))
       {  
        for(a = 1 ; a <= n ; a++)
        {
           if(a % 2 == 0)
           {
               result = a * a;
               System.out.printf("%d^%d = %d\n",a,c,result);
           }
        }
       }
    }
}
