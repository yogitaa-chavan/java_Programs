package Methods;

import java.util.Scanner;

public class EvenWithoutModulo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(isEven(num))
            System.out.println(num+" is even number");
        else
        System.out.println(num+" is not even number");

    }


    public static boolean isEven(int n){
        if(n/2==n/2.0)return true;
        return false;
    }

    
}
