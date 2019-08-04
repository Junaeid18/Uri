import java.util.Scanner;
public class Prb_1080 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num,hn = 0,pos = 0;
        for(int i = 1 ; i <= 100 ; i++)
        {
            num  = s.nextInt();
            if(num > hn )
            {
                hn = num;
                pos = i;
            }
        }
        System.out.printf("%d\n",hn);
        System.out.printf("%d\n",pos);
    }
}
