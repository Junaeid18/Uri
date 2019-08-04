import java.util.Scanner;
public class Prb_1046 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,sum;
        a = s.nextInt();
        b = s.nextInt();
        if(a >= b)
        {
            b = b + 24;
            sum = b - a;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",sum);
        }
        else
        {
            sum = b - a;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",sum);
        }
    }
    
}
