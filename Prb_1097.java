public class Prb_1097 {
    public static void main(String[] args) {
        int i = 1,j = 7 ,k =4;
        while(i<=9){
            System.out.printf("I=%d J=%d\n",i,j);
            j--;
            if(j == k){
                i = i+2;
                j = j+5;
                k = k+2;
            }
        }
    }
}
