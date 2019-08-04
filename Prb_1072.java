import java.util.Scanner;

public class Prb_1072 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n , x, in=0 , out=0 ;
        n = s.nextInt();
        for(int i=0; i<n; i++)
        {
            x = s.nextInt();
            if(x>= 10 && x<=20)
                in++;
            else out++;
        }
        System.out.printf("%d in\n",in);
        System.out.printf("%d out",out);
    }
}
