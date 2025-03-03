package Methods;

import java.util.Scanner;

public class PrevNextPrimeDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int nPrime=nextPrime(n);
        int pPrime=prevPrime(n);
        result(n, nPrime, pPrime);

    }
    public static int prevPrime(int n){
        
        int i=n-1;
        while(isPrime(i)!=true){
            isPrime(i);
            i-=1;
         }
           return i;
    }
    public static int nextPrime(int n){
        int i=n+1; 
            while(isPrime(i)!=true){
             isPrime(i);
             i+=1;
        }
        return i;
    }
    public static boolean isPrime(int n){
        int den =2;
        for(; den<n;den++)
            if(n%den==0)return false;
        return true;
    }

    public static void result(int n, int nPrime, int pPrime){
        if((n-pPrime)> (nPrime-n))
            System.out.println(n +" "+nPrime);
        else if((n-pPrime) < (nPrime-n))
            System.out.println(pPrime +" "+n);
        else
        System.out.println(pPrime +" "+n+" "+nPrime);
    }
}
