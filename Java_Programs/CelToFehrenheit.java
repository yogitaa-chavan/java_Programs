import java.util.Scanner;
class CelToFehrenheit 
{
	public static void main(String[] args) 
	{
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius :"); 
		float cel = aa.nextFloat();
		double fehren = (9.0/5)*cel+32;

		System.out.println(cel+" Celsius is "+fehren+"Fahrenheit");
	}
}
