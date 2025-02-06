import java.util.Scanner;
class SumOfEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem,evenS=0;

		while(num>0){
			rem=num%10;
			if(rem%2==0){
				evenS+=rem;
			}
			num/=10;
		}
		System.out.println("Even No. "+evenS);

	}
}
