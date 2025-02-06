import java.util.Scanner; 
class PoundToKilo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in pound");
		float num = sc.nextFloat();
		double ans=num*0.454;

		System.out.println(num + " pounds is "+ ans+ " kilograms");


	}
}
