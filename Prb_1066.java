import java.util.Scanner;
public class Prb_1066 {
    public static void main(String[] args)
    {
        int e , o , p ,n;
        e = o = p = n = 0;
        Scanner s  = new Scanner(System.in);
        int[] ar = new int[5];
        for(int a = 0 ; a < 5 ;a++)
        {
            ar[a] = s.nextInt();
            if(ar[a] > 0)
                p++;
            else if(ar[a] < 0)
                n++;
            if(ar[a]%2 == 0)
                e++;
            else o++;
        }
        System.out.printf("%d valor(es) par(es)\n",e);
        System.out.printf("%d valor(es) impar(es)\n",o);
        System.out.printf("%d valor(es) positivo(s)\n",p);
        System.out.printf("%d valor(es) negativo(s)\n",n);
    }
}
