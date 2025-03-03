package Methods;

import java.util.Scanner;

public class DuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        if(isDuckNum(n))
            System.out.println(n+" is a duck number");
        else
            System.out.println(n+" is not a duck number");
    }
    public static boolean isDuckNum(int n){
        String str=String.valueOf(n);
        if(str.charAt(0)=='0')return false;
        if(!str.contains("0")) return false;
        
        return true;
    }
}
