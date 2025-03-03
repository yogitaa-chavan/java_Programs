package Methods;

import java.util.Scanner;

public class PalindromeOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(isPalin(n))
            System.out.println(n+" is Paindrome");
        else
            System.out.println(n+" is Not palindrome ");
    }
    public static boolean isPalin(int n){
        int rev=0;
        for(int i=n;i!=0;i/=10){
            rev=rev*10+i%10;
        }
        return n==rev;
    }
}
