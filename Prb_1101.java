import java.util.Scanner;

public class Prb_1101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i==0){
            int m = s.nextInt(),n = s.nextInt(),sum=0;
            if (m>n){
                if(m>0){
                    if(n>0){
                        while(n<=m){
                            System.out.printf("%d ",n);
                            sum+=n; n++;
                        }
                        System.out.printf("Sum=%d\n",sum);
                    }else i=1;
                }else i=1;
            }else{
                if(n>0){
                    if (m>0){
                        while(m<=n){
                            System.out.printf("%d ",m);
                            sum+=m; m++;
                        }
                        System.out.printf("Sum=%d\n",sum);
                    }else i = 1;
                }else i = 1;
            }
        }
    }
}
