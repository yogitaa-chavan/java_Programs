import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{

		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		
		if(checkNum(num))
			System.out.println(num+" is strong number");
		else
			System.out.println(num+" is not strong number");

	}
	public static boolean checkNum(int num){
		int sum=0;
		for(int i=num;i>0;i/=10){
			int dgt = i%10;
			sum+=fact(dgt);

		}
		return sum==num;
	}
	public static int fact(int dgt){
		int f=1;
		for(int i=dgt;i>0;i--){
			f*=i;
		}
		return f;
	}
}
