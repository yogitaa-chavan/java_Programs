import java.util.*;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(checkArmstrong(n))
			System.out.println("Number is armstrong num");
		else
			System.out.println("Number is not armstrong num");
	}
	public static int findLen(int n){
		int len=0;
		for(int i=n;i>0;i/=10)
			len++;
		return len;
	}
	public static boolean checkArmstrong(int num){
		int sum=0;
		int len=findLen(num);
		for(int i =num;i>0;i/=10){
			int dgt =i%10;
			int p=1;
 
		for(int j=1;j<=len;j++){
			p*=dgt;
		}
		sum+=p;
		}
		return sum==num;
	}
}
