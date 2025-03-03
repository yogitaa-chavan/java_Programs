package Methods;

import java.util.Scanner;

public class CntOfGoodPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(isPrime(i) && goodPrime(i)){
                 System.out.print(i+ " ");
                    
        
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1)return false;
        int den=2;
        for(;den<n;den++)
            if(n%den == 0)return false;
        return true;
    }
    public static boolean goodPrime(int n){
        int rem=0;
        while(n>0){
            rem=n%10;
            if(rem==1)return false;
            if(isPrime(rem)==false)return false;
            n/=10;
        }
        return true;
    }
    
}
