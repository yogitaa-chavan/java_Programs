package Methods;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if(isAutomorphicNum(n))
            System.out.println(n+" is automorphic num");
        else
            System.out.println(n+" is not automorphic num");
    }
    public static boolean isAutomorphicNum(int n){
        int cnt=len(n);
        int div=div(n,cnt);
        int sqrt = n*n;
        return sqrt%div==n;
    }
    public static int div(int n, int l){
        int div=1;
        for(int i=1;i<=l;i++)
            div*=10;
        return div;
    }
    public static int len(int n){
        int l=0;
        for(int i=n;i>0;i/=10)
            l++;
        return l;
    }
}
