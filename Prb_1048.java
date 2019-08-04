import java.util.Scanner;
public class Prb_1048 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double a,b,sal;
        char c = '%';
        int per;
        a = s.nextDouble();
        if((a >= 0.00)&& (a <= 400.00))
        {
           per =  15;
           b = a * .15;
           sal = a + b;
           System.out.printf("Novo salario: %.2f\n",sal);
           System.out.printf("Reajuste ganho: %.2f\n",b);
           System.out.printf("Em percentual: %d %c\n",per,c);
        }
        else if((a >= 400.01) && (a <= 800.00))
        {
           per =  12;
           b = a * .12;
           sal = a + b;
           System.out.printf("Novo salario: %.2f\n",sal);
           System.out.printf("Reajuste ganho: %.2f\n",b);
           System.out.printf("Em percentual: %d %c\n",per,c);
        }
        else if((a >= 800.01) && (a <= 1200.00))
        {
           per =  10;
           b = a * .10;
           sal = a + b;
           System.out.printf("Novo salario: %.2f\n",sal);
           System.out.printf("Reajuste ganho: %.2f\n",b);
           System.out.printf("Em percentual: %d %c\n",per,c);
        }
        else if((a >= 1200.01) && (a <= 2000.00))
        {
           per =  7;
           b = a * .07;
           sal = a + b;
           System.out.printf("Novo salario: %.2f\n",sal);
           System.out.printf("Reajuste ganho: %.2f\n",b);
           System.out.printf("Em percentual: %d %c\n",per,c);
        }
        else if(a >= 2000.01)
        {
           per =  4;
           b = a * .04;
           sal = a + b;
           System.out.printf("Novo salario: %.2f\n",sal);
           System.out.printf("Reajuste ganho: %.2f\n",b);
           System.out.printf("Em percentual: %d %c\n",per,c);
        }
    }
}
