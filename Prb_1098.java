public class Prb_1098 {
    public static void main(String[] args) {
        int i=0,j=1,k=0,l=0,m=4,n=1;
        while(i<=2){
            if((i == 0 || i == 1|| i == 2) &&(l==0)){
                System.out.printf("I=%d J=%d\n",i,j);
            }else{
                System.out.printf("I=%d.%d J=%d.%d\n",i,k,j,k);
            }
            if((i == 2)&&(j == m-1))i++;
            j++;
            if(j == m){
                k += 2;
                j -=3;
                l++;
                if(k > 8){
                    i++; l=0; k=0; j++; m++;
                }
            }
        }
    }
}
