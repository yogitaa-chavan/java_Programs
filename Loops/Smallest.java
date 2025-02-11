import java.util.Scanner;
class Smallest 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a number : ");
		int num=new Scanner(System.in).nextInt();

		int min=9;
		for(int i=num;i>0;i/=10){
			int digit=i%10;
			if(min>digit)
				min=digit;
		}
	System.out.println("largest digit from "+num+" is " +min);
	}
}
