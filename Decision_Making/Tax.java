import java.util.Scanner;
class Tax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your income per annum ");
		double income = sc.nextFloat();
		
		if(income<1200000 && income>=0){
			System.out.println("No in TAX! ");
		}
		else if(income>=1200000 && income<=1600000){
			System.out.println("Your tax is "+ 0.15*income);
		}
		else if(income>1600000 && income<=2000000){
			System.out.println("Your tax is "+ 0.2*income);
		}
		else if(income>2000000 && income<=2400000){
			System.out.println("Your tax is "+ 0.25*income);
		}
		else if(income>=3000000){
			System.out.println("Your tax is "+ 0.3*income);
		}
		//else{
		//	System.out.println("");
		//}

	}
}
