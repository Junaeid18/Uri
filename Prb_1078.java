import java.util.Scanner;

public class Prb_1078 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n > 1 && n < 1000)
        {
            for(int i = 1; i < 11 ; i++)
            {
                int res = i * n;
                System.out.printf("%d x %d = %d\n" ,i,n,res);
            }
        }
    }
}
