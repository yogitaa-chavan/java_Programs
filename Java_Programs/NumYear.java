import java.util.Scanner;
class NumYear 
{
	public static void main(String[] args) 
	{
		int minDay = 1440;
		int daysYear = 365;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of minutes ");
		long min = sc.nextLong();

		long totDays = min/minDay;
		long year= totDays/daysYear;

		long remainingDays=totDays % daysYear;

		System.out.println(min +" minutes is approximately "+year+" years and "+remainingDays+ " days. ");


	}
}
