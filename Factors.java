package Methods;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isFactor(i,n))
                System.out.print(i+" ");

        }

    }
    public static boolean isFactor(int i,int n){
        return n%i==0;
    }
}
