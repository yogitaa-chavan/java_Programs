package Methods;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Sum of Even "+ findEven(num));
        System.out.println("Sum of odd "+ findOdd(num));

    }
    public static int findEven(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            if((i%10)%2==0)
                sum+=i%10;
        }
        return sum;
    }
    public static int findOdd(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            if((i%10)%2 != 0)
                sum+=i%10;
        }
        return sum;
    }
}
