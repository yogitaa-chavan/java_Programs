import java.util.Scanner;
class BmiReadding 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in pound ");
		float weight = sc.nextFloat();
		
		System.out.println("Enter your height in inches ");
		float ht = sc.nextFloat();
		double sq=ht*0.0254;
		double bmi= weight*0.45359237 / (sq*sq);
		System.out.println(bmi);
	}
}
