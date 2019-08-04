import java.util.Scanner;
public class Prb_1071 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x,y,i,j,sum=0;
        x = s.nextInt();
        y = s.nextInt();
        if(x > y)
        {
            if( y%2 == 0)
            {
                for(i = y+1 ; i < x; i = i+2)
                    sum  += i;
                System.out.printf("%d\n",sum);
            }else
            {
                for(i = y+2 ; i < x; i = i+2)
                    sum += i;
                System.out.printf("%d\n",sum);
            }
        }else if(y > x)
        {
            if(x%2 == 0)
            {
                for(j = x+1; j < y ; j= j+2)
                    sum += j;
                System.out.printf("%d\n",sum);
            }else
            {
                for(j = x+2; j < y ;j = j+2)
                    sum += j;
                System.out.printf("%d\n",sum);
            }
        }
        else 
            System.out.printf("%d\n",sum);
    }
}
