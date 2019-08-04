import java.util.Scanner;
public class Prb_1065 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c,d,e,g = 0;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        if(a%2 == 0)
            g++;
        if(b%2 == 0)
            g++;
        if(c%2 ==  0)
            g++;
        if(d%2 ==  0)
            g++;
        if(e%2 ==  0)
            g++;
        System.out.printf("%d valores pares\n",g);
    }
}
