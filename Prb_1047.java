import java.util.Scanner;
public class Prb_1047 {
    public static void main(String[] args)
    {
        int a,b,c,d,hr,min;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        c = s.nextInt();
        b = s.nextInt(); 
        d = s.nextInt();
        if(a > b)
        {
            if(c >= d)
            {
                b = b + 24;
                hr = b - a -1;
                min = 60 - c + d;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
            }
            else
            {
                b = b +24;
                hr = b - a;
                min = d - c;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
            }
            
        }
        else if(b > a)
        {
             if(d >= c)
             {
                 hr = b-a ;
                 min = d - c;
                 System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
             }
             else
             {
                 hr = b -a -1;
                 min = 60 - c + d;
                 System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
             }
        }
        else if(b == a)
        {
            if(c == d)
            {
                b = b + 24;
                hr = b - a;
                min = c - d;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
            }
            else if(c > d)
            {
                b = b +24;
                hr = b - a -1;
                min = 60 - c + d ;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
            }
            else
            {
                hr = b - a;
                min = d - c ;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hr,min);
            }
        }
        
    }
}
