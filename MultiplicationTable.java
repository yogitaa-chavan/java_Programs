package Methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        MultiTable(n);
    }
    public static void MultiTable(int n){
       // int res=1;
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i +" = "+n*i);
        }
    }
}
