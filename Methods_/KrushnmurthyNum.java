import java.util.Scanner;

public class KrushnmurthyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isKrushNum(n))
            System.out.println("Num is krushnmurthy num");
        else
            System.out.println("krushnmurthy number");
    }
    public static int fact(int n){
        int f=1;
        for(int i=n;i!=0;i--)
            f*=i;
        return f;
    }
    public static boolean isKrushNum(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            sum+=fact(n);
        }
        return sum==n;
    }
}
