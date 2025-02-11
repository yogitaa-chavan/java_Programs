import java.util.Scanner;
class ReverseNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0,rem=0;

		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("Num : "+dup +" Reverse Num : "+rev);
	}
}
