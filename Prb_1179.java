/**
 * Prb_1179
 */
import java.util.Scanner;
public class Prb_1179 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, even[]= new int[5], odd[] = new int[5], number = 0,ec = 0, oc = 0 ;
        while(count < 15){
            number = s.nextInt();
            if(number % 2 == 0){
                even[ec] = number;
                ec++;
                if(ec % 5 == 0){
                    int i = 0;
                    while(i < 5){
                        System.out.println("par["+i+"] = "+even[i]);
                        ++i;
                    }
                    ec = 0; 
                }
            }else{
                odd[oc] = number;
                oc++;
                if(oc % 5 == 0){
                    int i = 0;
                    while(i < 5){
                        System.out.println("impar["+i+"] = "+odd[i]);
                        ++i;
                    }
                    oc = 0;
                }        
            }
            count++;
        }
        int remainingOdd = (oc % 5);
        int remainingEven = (ec % 5);
        if(remainingOdd > 0){
            int i = 0;
            while(i < remainingOdd){
                System.out.println("impar["+i+"] = "+odd[i]);
                ++i;
            }
        }
        if(remainingEven > 0){
            int i = 0;
            while(i < remainingEven){
                System.out.println("par["+i+"] = "+even[i]);
                ++i;
            }
        }
    }
}