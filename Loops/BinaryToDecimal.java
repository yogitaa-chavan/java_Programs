import java.util.*;
class BinaryToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println("binary num "+bin);
		int n = Integer.parseInt(bin,2);
		System.out.println("decimal num "+n);
	}
}
