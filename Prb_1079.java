import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Prb_1079 {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        float[][] ar = new float[n][3];
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0 ; j < 3; j++)
            {
                ar[i][j] = s.nextFloat();
            }
        }
        float[] w = {2f,3f,5f};
        float sum  = w[0]+ w[1] + w[2];
        float[] su = new float[n];
        float[] avg = new float[n];
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0 ; j < 3; j++)
            {
                su[i] += ar[i][j] * w[j];
            }
        }
        for(int i = 0 ;i < n ; i++ )
        {
            avg[i] = su[i] / sum;
        }
        for(int i = 0 ;i < n ; i++ )
        {
            System.out.printf("%.1f\n",avg[i]);
        }
    }
}
