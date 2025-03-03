package Methods;

import java.util.Scanner;

public class PerfectSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
 
            if(isPerfectSq(n))
                System.out.println(n+" is a perfect square ");
            else
                System.out.println(n+ " is not perfect sq");
        

    }
    public static boolean isPerfectSq(int n){
        for(int i=1;i*i<=n;i++)
            if(i*i==n) return true;
        return false;
    }
}
