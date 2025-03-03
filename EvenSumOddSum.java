package Methods;

import java.util.Scanner;

public class EvenSumOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int eSum=0, oSum=0;
        for(int i=n;i>0;i/=10){
            if(isEven(i%10))eSum+=i%10;
            if(isOdd(i%10))oSum+=i%10;
        }
        System.out.println("Even Sum : "+eSum+"  "+"Odd Sum : "+oSum);
    }
    public static boolean isEven(int n){
        return n/2==n/2.0;
    }
    public static boolean isOdd(int n){
        return n%2!=0;
    }
}
