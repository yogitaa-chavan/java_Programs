import java.util.*;
class LoanCal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Loan Calculator");
		System.out.println();
		System.out.println("Enter the amount");
		float amt=sc.nextInt();
		System.out.println("Enter the ROI");
		float roi=sc.nextFloat();
		System.out.println("Enter the tenure (months) : ");
		int month = sc.nextInt();

		//con from months to years

		String str = (month/12)+" "+(month%12);
		float  con= Float.parseFloat(str);
		System.out.println();

		System.out.println("Loan Calculator");
		System.out.println("Principal amount : "+amt);
		System.out.println("ROI : "+roi="%");
		System.out.println("Tenure : "+ month+" months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+ totalInter);
		float outStanding = amount+totalInter;
		System.out.println("Total Outstanding Amount "+(outStanding));
		System.out.println("Emi : "+(outStanding/month)= "rs");












		int months = 20;
		int years = months/12;
		int mnth = months%12;

		System.out.println(years+(mnth/10.0));
		
	}
}
