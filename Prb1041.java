
import java.util.Scanner;

public class Prb1041 {
    public static void main(String[] args)
    {
        double a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        if((a == 0) && (b == 0))
            System.out.printf("Origem\n");
        else if((a ==0) && ((b > 0) || ( b < 0)))
            System.out.printf("Eixo Y\n");
        else if(((a > 0 ) ||(a < 0)) &&( b == 0))
        System.out.printf("Eixo X\n");
        else if((a > 0) && (b > 0) )
            System.out.printf("Q1\n");
        else if((a < 0 ) && (b > 0))
            System.out.printf("Q2\n");
        else if((a < 0) && (b < 0 ))
            System.out.printf("Q3\n");
        else if((a > 0) && (b < 0))
            System.out.printf("Q4\n");
                
    }
}
