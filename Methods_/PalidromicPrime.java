import java.util.*;
class PalidromicPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");	
		int n=new Scanner(System.in).nextInt();
		if(isPalindrome(n) && isPrime(n))
			System.out.println(n+" is a palidromicprime num");
		else
			System.out.println(n+" is a not palidromicprime num");

	}
	public static boolean isPalindrome(int n){
		int rev=0;
		for(int i=n;i>0;i/=10)
			rev=rev*10+i%10;
		return rev==n;
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	

}
