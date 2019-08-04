import java.util.Scanner;
public class Prb_1052 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        if(a == 1)
            System.out.printf("January\n");
        else if( a == 2)
            System.out.printf("February\n");
        else if( a == 3 )
            System.out.printf("March\n");
        else if(a == 4)
            System.out.printf("April\n");
        else if(a == 5)
            System.out.printf("May\n");
        else if(a == 6)
            System.out.printf("June\n");
        else if(a ==7 )
            System.out.printf("July\n");
        else if( a == 8)
            System.out.printf("August\n");
        else if( a == 9)
            System.out.printf("September\n");
        else if(a == 10)
            System.out.printf("October\n");
        else if(a ==11)
            System.out.printf("November\n");
        else
            System.out.printf("December\n");
    }
}
