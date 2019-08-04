import java.util.Scanner;
public class Prb_1045 {
    public static void main(String[] args)
    {
        double a[] = new double[3];
        int i,j;
        Scanner s = new Scanner(System.in);
        for(i = 0 ; i < 3 ; i++)
        {
            a[i] = s.nextDouble();
        }
        for(i = 2 ; i >= 0; i--)
        {
            int t = 0 ;
            for(j = 1 ; j <= i ; j++)
            {
                if( a[t] > a[j])
                {
                    t = j;
                }
            }
            double temp = a[t];
            a[t] = a[i];
            a[i] = temp;
        }
        if(a[0] >= a[1]+a[2])
            System.out.printf("NAO FORMA TRIANGULO\n");
        else if((a[0]*a[0]) == (a[1]*a[1])+(a[2]*a[2]))
            System.out.printf("TRIANGULO RETANGULO\n");
        else if((a[0]*a[0]) > (a[1]*a[1])+(a[2]*a[2]))
            System.out.printf("TRIANGULO OBTUSANGULO\n");
        else if((a[0]*a[0]) < (a[1]*a[1])+(a[2]*a[2]))
            System.out.printf("TRIANGULO ACUTANGULO\n");
        if(a[0] == a[1] && a[1]== a[2]) 
            System.out.printf("TRIANGULO EQUILATERO\n");
        else if((a[0]==a[1]) || (a[0]== a[2]) || (a[1]== a[2]))
            System.out.printf("TRIANGULO ISOSCELES\n");
       
    }
}