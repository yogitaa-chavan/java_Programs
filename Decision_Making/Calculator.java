import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter a num2 : ");
		int num2=sc.nextInt();

		System.out.println("Enter a operator : ");
		char ch = sc.next().charAt(0);
		
		float res = (ch=='+')?(num1+num2):((ch=='-')?(num1-num2):((ch=='*')?(num1*num2):((ch=='/')?(num1/num2):((ch == '%') ? (num1 % num2):(0.00001f)))));
		if(!(res==0.00001f)){
			System.out.println(num1+" "+ ch +" "+num2+" = "+res);
		}
		
		
	}
}
