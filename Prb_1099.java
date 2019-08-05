import java.util.Scanner;

public class Prb_1099 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0,j,k,sum=0;
        while(i<n){
            j = s.nextInt();
            k = s.nextInt();
            if(j<k)j++;
            else{
                int t = j; j = k; k = t; j++;
            }
            while(j<k){
                if(j%2 != 0){
                    sum+=j;
                }j++;
            }
            System.out.printf("%d\n",sum);
            i++;
            sum = 0;
        }
    }
}
