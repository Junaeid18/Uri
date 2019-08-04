import java.util.Scanner;
public class Prb_1070 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i,j;
        if(x % 2 == 0)
        {
            for(i = x+1 ; i <= x+11 ; i = i+2)
                System.out.printf("%d\n",i);
        }else
        {
            for(j = x; j<= x+11; j= j+2)
                System.out.printf("%d\n",j);
        }
    }
}
