import java.util.*;
class BinaryNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num = sc.nextInt();
		String temp = Integer.toBinaryString(num);
		System.out.println("Binary Number : "+temp);
	}
}
