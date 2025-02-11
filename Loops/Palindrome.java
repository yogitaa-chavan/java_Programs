import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rem=0,rev=0;
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		int temp=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==temp){
			System.out.println(temp+" is a palindrome");
		}else{
			System.out.println(temp+" is a not palindrome");
		}
	}
}
