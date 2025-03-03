package Methods;

import java.util.Scanner;

public class EyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        String team1 = "00000000";
        String team2 = "1111111";

        boolean check0 = str.contains("0000000");
        boolean check1 = str.contains("11111111");
       
        System.out.println(check0 || check1 ? "YES" : "NO");
    }
}
