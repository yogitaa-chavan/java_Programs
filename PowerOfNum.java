package Methods;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Enter a range "); 
        int r=sc.nextInt();
        System.out.println(power(n,r));
    }
    public static int power(int n, int range){
        int p=1;
        for(int i=0;i<range;i++)
            p*=n;
        return p;
    }
}
