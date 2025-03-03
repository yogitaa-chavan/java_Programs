package Methods;

import java.util.Scanner;

public class ISBNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextLong();
        if(isIsbnNum(num))
            System.out.println(num+" is ISBN number");
        else
            System.out.println(num+" is not ISBN number");
    }
    public static boolean isIsbnNum(long n){
        long sum=0;
            for(long j=n, cnt=1;j!=0;j/=10,cnt++)
                sum+=j*cnt;
        return sum%11==0;
    }
}
