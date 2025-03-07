import java.util.*;
class ArmstrongNum2
{
	public static void main(String[] args) 
	{

		System.out.print("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		for(int i=1;i<n;i++){
			if(isArmstrong(i))
				System.out.print(i+" ");
		}
	}
	public static boolean isArmstrong(int n){
		int sum=0;
		int ct=count(n);
		for(int i=n;i>0;i/=10){
			sum+=power(i%10 , ct);
		}
		return sum==n;
	}
	public static int power(int n,int ct){
		int p=1;
		for(int i=0;i<ct;i++)
			p*=n;
		return p;
	}
	public static int count(int n){
		int ct=0;
		for(int i=n;i>0;i/=10)
			ct++;
		return ct;
	}
}
