import java.util.Scanner;
class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int evenSum=0,oddSum=0;
		int num=7264;
		int ans;
		int rem=num%10;


		while(num>0){
	   rem=num%10;
		if(rem%2==0){
			evenSum+=rem;
		}else{
			oddSum+=rem;
		}
		num=num/10;
		
		}
		System.out.println("Even sum  "+evenSum+"    Odd sum "+oddSum);
	
	}
}
