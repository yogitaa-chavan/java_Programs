import java.util.*;
class TechNum 
{
	public static void main(String[] args) 
	{

		System.out.print("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		if(isTech(n))
			System.out.print("Number is Tech Number");
		else
			System.out.print("Number is not Tech Number");


	}
	public static boolean isTech(int n){
		int d=div(n);
		int temp=n;
		System.out.println(n%d);
		int sum = (n%d) + (n/d);
		
		return temp == (sum*sum);
	}
	public static int div(int num){
		int div=1;
		int len=len(num);
		for(int i=0;i<len/2;i++)
			div*=10;
		return div;
	}
	public static int len(int n){
		int len=0;
		for(int i=n;i>0;i/=10)
			len++;
		return len;
}
}
