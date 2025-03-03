package Methods;

import java.util.Scanner;

public class FscinatingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(isFascinating(num) && fascinatingWithoutStr(num))
            System.out.println(num+" is fascinating num");
        else
            System.out.println(num+" is not fascinating number");

    }
    public static boolean isFascinating(int n){
        
        String str=n+""+(n*2) + (n*3);
        int cnt = 0;
        for(int ch ='1'; ch<='9';ch++){
            cnt=0;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i))
                 cnt++;
             }
            if(cnt!=1) return false;
        }
        return true;
    }

    public static boolean fascinatingWithoutStr(int n){
        int num=0;
        int temp=n;
        for(int i=2;i<=3;i++){
            num=(num*1000)+(temp*i);
        }
        return checkNum(num);
    }
    public static boolean checkNum(int num ){
        int cnt=0;
        for(int ch ='1'; ch<='9';ch++){
            cnt=0;
            for(int i=0;i<num;i++){
                if(ch==i)
                 cnt++;
             }
            if(cnt!=1) return false;
        }
        return true;
    }
}
