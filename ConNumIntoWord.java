package Methods;

import java.util.Scanner;

public class ConNumIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="";
        for(int i=n;i>0;i/=10){
            str=numToString(i%10)+" "+str;
        }
        System.out.print(str);
    }
    public static String numToString(int n){
        switch(n){
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 8 : return "eight";
        }
        return "nine";
    }

}
