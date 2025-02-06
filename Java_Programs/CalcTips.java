import java.util.Scanner;
class CalcTips 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subtotal and tip rate");
		float subTot=sc.nextFloat();
		float tipRate=sc.nextFloat();
		double ans = (tipRate/100)*subTot;

		double total = ans+subTot;

		System.out.println("The tip is "+ans +" and total is "+total);
	}
}
