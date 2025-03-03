package Methods;

import java.util.Scanner;

public class MakePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        while(isPrime(n)!=true){
            isPrime(n);
                n+=1;  
           
        }
        System.out.println(n);
    }
    public static boolean isPrime(int n){
        int den=2;
        for( ;den<n;den++)
            if(n%den==0)return false;
        return true;
    }
    public static int makePrime(int n){
        return n+1;
    }
}
