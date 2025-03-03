package Methods;

import java.util.Scanner;

public class NumToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(NumToB(n));
    }
    public static String NumToB(int n){
        String bin="";
        for(int i=n;i>0;i/=2){
            bin = i%2+bin;
        }
        return bin;
    }
}
