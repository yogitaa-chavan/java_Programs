import java.util.*;
class BouncyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		if(!isBouncyNum(n))
			System.out.println("number is bouncy ");
		else
			System.out.println("number is not bouncy ");
	}


	public static boolean isIncreasing(int n){
		int prevDgt=n%10;
		boolean isIncreasing=false;
		n/=10;
		for(int i=n;i>0;i/=10){
			int currDgt=i%10;
			if(prevDgt>currDgt)
				isIncreasing = true;
		}
		return isIncreasing;
	}


	public static boolean isDecreasing(int n){
		int temp=0, dgt=0;
		for(int i=n;i>0;i/=10){
			dgt=i%10;
			if(temp<dgt)
				temp=dgt;
			else
				return false;
		}
		return true;
}
	public static int rem(int n){	
		for(int i=n;i>0;i/=10)
			return n%10;
		return 1;
	}
	public static boolean isBouncyNum(int n){
		if(isIncreasing(n) || isDecreasing(n))
			return true;
		return false;
	}

}