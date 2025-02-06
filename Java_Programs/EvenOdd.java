import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//even odd without %
		//1st (num/2)*2==num
		//2nd way num/2==num/2.0
		if((num/2)*2==num){

		System.out.println("even");
		}else 
			System.out.println("odd");
	}
}
