import java.util.Scanner;
public class Prb_1040 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float a,b,c,d,avg;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        d = s.nextFloat();
        avg = ((a*2) + (b*3) + (c*4) + (d)) / 10;
        System.out.printf("Media: %.1f\n",avg);
        if(avg >= 7.0)
        {
            System.out.printf("Aluno aprovado.\n");
        }
        else if(avg < 5.0)
        {
            System.out.printf("Aluno reprovado.\n");
        }
        else
        {
            System.out.printf("Aluno em exame.\n");
            float e = s.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",e);
            avg = (avg + e)/2 ;
            if(avg >= 5.0)
            {
                System.out.printf("Aluno aprovado.\n");
            }
            else{
                System.out.printf("Aluno reprovado\n");
            }
            System.out.printf("Media final: %.1f\n",avg);
        }
    }
}
