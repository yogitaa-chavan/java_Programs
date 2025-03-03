package Methods;

import java.util.Scanner;

public class ConvertEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if(len(n)%2==0) even(n);
        else odd(n);
    }
    public static int len(int n){
        int len=0;
        for(int i=n;i!=0;i/=10)
            len++;
        return len;
    }
    public static void even(int n){
        for(int i=n;i!=0;i/=10){
             int rem= i%10;
            if(rem %2!=0)
                rem+=1;
            System.out.print(rem+" ");
        }
    }
    public static void odd(int n){
        for(int i=n;i!=0;i/=10){
            int rem=i%10;
            if(rem%2 ==0)
                rem+=1;
            System.out.print(rem+" ");
        }
    }
}
