package Methods;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(isFactor(i,n))
                sum+=i;
        }
        System.out.print(sum);

    }
    public static boolean isFactor(int i, int n){
        return n%i==0;
    }
}
