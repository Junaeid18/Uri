import java.util.Scanner;
public class Prb_1050 {
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int a;
        a = s.nextInt();
        if(a == 61)
        {
            System.out.printf("Brasilia\n");
        }
        else if(a == 71)
        {
            System.out.printf("Salvador\n");
        }
        else if(a == 11)
        {
            System.out.printf("Sao Paulo\n");
        }
        else if(a == 21)
        {
            System.out.printf("Rio de Janerio\n");
        }
        else if(a == 32)
        {
            System.out.printf("Juiz de Fora\n");
        }
        else if(a == 19)
        {
            System.out.printf("Campinas\n");
        }
        else if(a == 27)
        {
            System.out.printf("Vitoria\n");
        }
        else if(a == 31)
        {
            System.out.printf("Belo Horizonte\n");
        }
        else
            System.out.printf("DDD nao cadastrado\n");
    }
}
