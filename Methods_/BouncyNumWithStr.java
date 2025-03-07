import java.util.*;
class BouncyNumWithStr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		String str = String.valueOf(n);
		if(isInAndDecrease(str))
			System.out.println("number is bouncy ");
		else
			System.out.println("number is not bouncy ");
		
	}
	public static boolean isInAndDecrease(String str){
		boolean isIncreasing=false;
		boolean isDecreasing=false;
		for(int i=str.length()-1;i>0;i--){
			if(str.charAt(i)>str.charAt(i-1))
				isIncreasing=true;
			else
				isDecreasing=true;
		}
		if(isIncreasing && isDecreasing){
			return true;
		}
		return false;
	}
}
