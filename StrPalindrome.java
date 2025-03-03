package Methods;

import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        if(isPalin(str))
            System.out.print(str+ " is palindrome");
        else
            System.out.println(str+" is not palindrome");
        System.out.println(revStr(str));
        }

    public static boolean isPalin(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++)
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
        return true;
    }

    public static String revStr(String str){
        StringBuffer sb = new StringBuffer("");
        for(int i=str.length()-1;i>=0;i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }
}
