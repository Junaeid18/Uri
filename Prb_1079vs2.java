import java.util.Scanner;
public class Prb_1079vs2 {
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       float a,b,c,d;
       int n = s.nextInt();
       for(int i = 0; i < n; i++ )
       {
           a = s.nextFloat();
           b = s.nextFloat();
           c = s.nextFloat();
           d = ((a * 2)+(b * 3)+(c * 5))/10; 
           System.out.printf("%.1f\n" ,d);
       }
    }
}
