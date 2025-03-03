package Methods;

import java.util.Scanner;

public class EmirpNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isPrime(n) && isPrime(reverse(n))){
            System.out.println("Number is Emirp number");
        }else
            System.out.println("Number is not Emirp number");
    }
    
    public static boolean isPrime(int n){
        int den=2;
        for(;den<n;den++)
            if(n%den == 0)return false;
        return true;
    }

    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}
