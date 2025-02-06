import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		int s=0,r;

		while(n>0){
			r=n%10;
			s+=r;
			n/=10;
		}
		System.out.println(s);
	}
}
