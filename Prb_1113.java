import java.util.Scanner;

public class Prb_1113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(i==0){
            int x = s.nextInt(),y = s.nextInt();
            if(x == y) i = 1;
            else if( y > x){
                System.out.printf("Crescente\n");
            }else {
                System.out.printf("Decrescente\n");
            }
        }
    }
}
