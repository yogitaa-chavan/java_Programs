package Methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isLeapYear(n)){
            System.out.println("Year is leap year");
        }else{
            System.out.println("Year is not leap year");
        }
    }

    public static boolean isLeapYear(int year){
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) return true;
        return false;
    }
}
