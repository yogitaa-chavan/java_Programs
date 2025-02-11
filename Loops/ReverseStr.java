import java.util.Scanner;
class ReverseStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word  ");
		String str = sc.next();

		System.out.println();


		// 1st App
		StringBuffer rev=new StringBuffer(str);
		System.out.print(rev.reverse());

		System.out.println();


		// 2nd App
		String revv="";
		for(int i=0;i<str.length();i++)
			revv=str.charAt(i)+revv;		
			System.out.print(revv);
		

		  System.out.println();


		//3rd App
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));

		}
	}
}
