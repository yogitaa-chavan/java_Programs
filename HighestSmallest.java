package Methods;

import java.util.Scanner;

public class HighestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Highest digit : "+ highestNum(n));
        System.out.println("Lowesst digit : "+lowestNum(n));
    }
    public static int highestNum(int n){
        int max=Integer.MIN_VALUE;
        for(int i=n;i!=0;i/=10){
            if((i%10)>max) max=i%10;
        }
        return max;
    }
    public static int lowestNum(int n){
        int min = Integer.MAX_VALUE;
        for(int i=n;i!=0;i/=10){
            if((i%10)<min) min=i%10;
        }
        return min;
    }
}
