import java.util.Scanner;
class CurrConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Currancy Convertor");
		System.out.print("Enter the value in INR ");
		float curr = sc.nextFloat();
		System.out.println();


		System.out.println("List of currancies");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. KRW");		
		System.out.println("6. CHF");
		
		System.out.println("Enter convertor");
		String opt=sc.next().toUpperCase();
		float conCurr = 0;
		if(opt.equals("USD")){
			conCurr=curr/86.56f;
		System.out.println(curr+" INR "+ conCurr+" USD");

		}
		if(opt.equals("EUR")){
			conCurr=curr/90.26f;
		System.out.println(curr+" INR "+ conCurr+" EUR");

		}
		if(opt.equals("GBP")){
			conCurr=curr/107.65f;
		System.out.println(curr+" INR "+ conCurr+" GBP");

		}
		if(opt.equals("PKR")){
			conCurr=curr/0.310f;
		System.out.println(curr+" INR "+ conCurr+" PKR");

		}
		if(opt.equals("KRW")){
			conCurr=curr/0.059f;
		System.out.println(curr+" INR "+ conCurr+" UDD");

		}
		if(opt.equals("CHF")){
		  conCurr=curr/95.51f;
		System.out.println(curr+" INR "+ conCurr+" UDD");

		}



		


	}
}
