import java.util.*;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(isNeon(i))
			System.out.print(i+" ");
		}
		
	}
	public static int sqrt(int n){
		return n*n;
	}
	public static int getDivisor(int n){
		int div=1;
		for(int i=n;i>0;i/=10)
			div*=10;
		return div;
	}
	public static boolean isNeon(int n){
		int sum=0;
		int div=getDivisor(n);
		int num=sqrt(n);
		for(int i=num;i>0;i/=div){
			int rem=i%div;
			sum+=rem;
		}
		return sum==n;
	}
}
