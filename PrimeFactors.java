package Methods;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isFactor(i,n) && isPrime(i))
                System.out.print(i+" ");

        }

    }

    
    public static boolean isFactor(int i,int n){
        return n%i==0;
    }


    public static boolean isPrime(int n){
        for(int i=2;i<n;i++)
            if(n%i==0) return false;
        return true;
    }

}
