import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Prb_1094 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i=0,total=0,c=0,r=0,s=0,j=0;
        String cp;
        while(i<n){
            j = in.nextInt();
            total += j;
            cp = in.next();
            if(cp.equals("C"))c+=j;
            else if(cp.equals("R"))r+=j;
            else s+=j;
            i++;
        }
        double rc,rr,rs;
        rc = (c *100);  rc = rc/total;
        rs = (s *100);  rs = rs/total;
        rr = (r *100);  rr = rr/total;
        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",c);
        System.out.printf("Total de ratos: %d\n",r);
        System.out.printf("Total de sapos: %d\n",s);
        System.out.printf("Percentual de coelhos: %.2f ",rc);
        System.out.print("%\n");
        System.out.printf("Percentual de ratos: %.2f ",rr);
        System.out.print("%\n");
        System.out.printf("Percentual de sapos: %.2f ",rs);
        System.out.print("%\n");
    }
}
