import java.util.Scanner;
class Largest 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a number : ");
		int num=new Scanner(System.in).nextInt();

		int max=0;
		for(int i=num;i>0;i/=10){
			int digit=i%10;
			if(max<digit)
				max=digit;
		}
	System.out.println("largest digit from "+num+" is " +max);
	}
}
