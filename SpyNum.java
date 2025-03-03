package Methods;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(Mul(n)==Sum(n))
            System.out.println("Spy number");
        else
            System.out.println("not spy number");
    }   
    public static int Mul(int n){
        int m=1;
        for(int i=n;i!=0;i/=10){
            m*=i%10;
        }
        return m;
    }
    public static int Sum(int n){
        int s=0;
        for(int i=n;i!=0;i/=10){
            s+=i%10;
        }
        return s;
    }
}
