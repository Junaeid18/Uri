import java.util.Scanner;
public class Prb_1044 {
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a%b;
        d = b%a;
        if(c == 0 )
            System.out.printf("Sao Multiplos\n");
        else if( d == 0)
            System.out.printf("Sao Multiplos\n");
        else
            System.out.printf("Nao sao Multiplos\n");
    }
}
