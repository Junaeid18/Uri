import java.util.Scanner;
public class Prb_1180 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, numCount, min = 0 , pos = 0, numC;
        numCount = s.nextInt();
        min = s.nextInt();
        pos = count;
        ++count;
        while(count < numCount){
            numC = s.nextInt();
            if(min > numC ){
                min = numC;
                pos = count;
            }
            ++count;
        }
        System.out.println("Menor valor: "+min);
        System.out.println("Posicao: "+pos);
    }
}
