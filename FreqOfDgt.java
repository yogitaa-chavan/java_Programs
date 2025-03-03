package Methods;

import java.util.Scanner;

public class FreqOfDgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        freqOfNum(n);
        System.out.println(mostFrequentDgt(n));
        System.out.println(leastFrequent(n));
    }
    public static void freqOfNum(int n){
        int cnt=0;
        for(int j=0;j<=9;j++){
            cnt=0;
            for(int i=n; i!=0;i/=10){
                if(j==i%10) {
                    cnt++;
                }
                  
            }
            if(cnt>0)
            System.out.println(j+" : "+cnt);
        }
    }
    public static int mostFrequentDgt(int n){
        int maxF=0, ct=0;
        for(int j=0;j<=9;j++){
            ct=0;
            for(int i=n;i>0;i/=10){
                int rem=i%10;
                if(rem==j)ct++;
            }
            if(ct>maxF)
            maxF=j;
        }
        return maxF;
    }
    public static int leastFrequent(int n){
        int leastF=9, ct=0,leastNum=0;
        for(int j=0;j<=9;j++){
            ct=0;
            for(int i=n;i>0;i/=10)
            {
                if(j==i%10)
                    ct++;
            }
        if(ct<leastF && ct>0){
            leastF=ct;
            leastNum=j;
        }

    }
        return leastNum;
    }
    
 }
