import java.util.Scanner;
class TimeTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sonday");

		System.out.print("Enter a number ");
		int op=sc.nextInt();
		switch(op) {
			case 1: 
			{
				System.out.println("Practice Math");
				break;
			}
			case 2: 
			{
				System.out.println("Experiance Science");
				break;
			}
			case 3: 
			{
				System.out.println("Speak English");
				break;
			}
			case 4: 
			{
				System.out.println("Do art and craft ");
				break;
			}
			case 5: 
			{
				System.out.println("Understand History ");
				break;
			}
			case 6: 
			{
				System.out.println("Learn marathi grammer ");
				break;
			}
			case 7: 
			{
				System.out.println("Chillax!");
				break;
			}
			default: 
			{
				System.out.println("Invalid Number ");
				break;
			}
		}
	}
}
