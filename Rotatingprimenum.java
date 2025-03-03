package Methods;

import java.util.Scanner;

public class Rotatingprimenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rot=0;
       int cnt=count(n);
      //  for(int i=n;i>0;i/=10)
        //for(int i=0;i<cnt;i++)
       // {
            if(isPrime(n%10)){
                rot=rotate(n);
                System.out.println(rot);
            }else{
                System.out.println(n);
            }
            
      //  }
            
        }
    public static int rotate(int num){
        return (num%10 *(power(10,(count(num)-1))))+(num/10);
    }
    public static int count(int num){
        int cnt=0;
        for(int i=num; i>0; i/=10)
            cnt++;
        return cnt;
    }
    public static int power(int n,int range){
        int p=1;
        for(int i=1;i<=range;i++)
            p*=n;
        return p;
    }
    public static boolean isPrime(int n){
        int den=2;
        for(;den<n;den++)
            if(n%den==0)return false;
        return true;
    }
}
