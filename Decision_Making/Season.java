import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a month : ");
		String m = sc.nextLine().toLowerCase();

		String ans=(m.equals("oct")||m.equals("nov") || m.equals("dec") || m.equals("jan"))?("Winter"):((m.equals("feb") || m.equals("mar") || m.equals("apr") || m.equals("may"))?
			("Summer"):(m.equals("jun") || m.equals("jul") || m.equals("aug") || m.equals("sep"))?("Mansoon"):("Enter valid input"));
			//:("Eter valid input");
	    System.out.println(ans);
		}
}
