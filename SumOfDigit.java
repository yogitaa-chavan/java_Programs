package Methods;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" is "+sumOfDgt(n));
    }
    public static int sumOfDgt(int n){
        int sum=0;
        for(int i=n;i!=0;i/=10)
            sum+=i%10;
        return sum;
        
    }
}
