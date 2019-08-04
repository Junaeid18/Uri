import java.util.Scanner;
public class Prb_1042 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        for(int i = 0 ; i < 3 ;  i++ )
        {
            a[i] = s.nextInt();
        }
        int b[] = new int[3];
        System.arraycopy(a, 0, b, 0, 3);
        for(int i = 2 ; i >= 0; i--)
        {
            int t = 0;
            for(int j = 1 ; j <= i; j++)
            {
                 if(a[t] < a[j])
                 {
                     t = j;
                 }
            }
            int temp =  a[i];
            a[i] = a[t];
            a[t] = temp;  
        }
        System.out.printf("%d\n",a[0]);
        System.out.printf("%d\n",a[1]);
        System.out.printf("%d\n",a[2]);
        System.out.printf("\n");
        System.out.printf("%d\n",b[0]);
        System.out.printf("%d\n",b[1]);
        System.out.printf("%d\n",b[2]);
    }
}
