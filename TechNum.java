package Methods;

import java.util.Scanner;

public class TechNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(techNum(n))
            System.out.println(n+" is tech number");
        else
            System.out.println(n+" is not tech number");
    }
    public static int div(int n, int cnt){
        int div=1;
        for(int i=1;i<=cnt/2;i++)
            div*=10;
        return div;
    }
    public static boolean techNum(int n){
        int temp=n;
        int div=div(n , len(n));
        int sum=(n%div) + (n/div);
        return (sum*sum)==temp;
    }
    public static int len(int n){
        int len=0;
        for(int i=n;i!=0;i/=10)
            len++;
        return len;
    }
}
