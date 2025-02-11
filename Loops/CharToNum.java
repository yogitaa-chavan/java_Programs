import java.util.Scanner;
class CharToNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character");
		String c = sc.nextLine().toUpperCase();
		
		int num = 0;
		for(int i=0;i<c.length();i++){
			num = num  * 26+(c.charAt(i)-'A'+1);
			
		}
		System.out.println(num);
	}
}
