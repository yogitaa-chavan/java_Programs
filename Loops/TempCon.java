import java.util.Scanner;
class TempCon 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter temperature in degree :");
		float temp=sc.nextFloat();


		System.out.println("Degree to rankine");
		float res = (temp+273.15f)*9/5;
		System.out.println("rankine "+res);
		System.out.println();


		System.out.println("Degree to Fahrenheit");
		float res2=temp*9/5+32;
		System.out.println("fahrenheit "+res2);
		System.out.println();


		System.out.println("Degree to Kelvin");
		float res3=temp+ 273.15f;
		System.out.println("kelvin "+res3);
		System.out.println();
	}
}



