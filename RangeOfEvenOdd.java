package Methods;

import java.util.Scanner;

public class RangeOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isEven(i))
                System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Odd numbers ");
        for(int i=1;i<=n;i++){
            if(isOdd(i))
                System.out.print(i+" ");
        }
    }
    public static boolean isEven(int n){
        return n/2==n/2.0;
    }
    public static boolean isOdd(int n){
        return n%2!=0;
    }
}
