import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		if(num % 7 == 0)
			System.out.println(num +" is a Buzz number");
		else{
			 int rem = num%10;
			 if(rem==7)
				System.out.println(num +" is a Buzz number");
			 else
				 System.out.println(num +" is not a Buzz number");
		}
	}
}
