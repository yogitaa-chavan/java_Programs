package Methods;

import java.util.Scanner;

public class Evil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isEvil(n))
            System.out.println("Evil number");
        else
            System.out.println("not evil number");
    }
    public static String NumToBin(int n){
        String bin ="";
        for(int i=n;i>0;i/=2){
            bin = i%2 + bin;
        }
        return bin;
    }
    public static int countOf1(int n){
        int num =Integer.parseInt(NumToBin(n));
        int l=0;
       
        for(int i=num;i!=0;i/=10)
            if(i%10==1)l++;
        return l;
    }
    public static boolean isEvil(int num){
        int n=countOf1(num);
        if(n%2==0)return true;
        return false;
    }
}
