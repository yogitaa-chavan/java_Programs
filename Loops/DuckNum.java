import java.util.*;
class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String num=sc.next();
		if(num.charAt(0)=='0'){
		System.out.print("Number is not duck number ");
			
			}else{
				if(num.contains("0"))
					System.out.print("Number is duck number ");
				else
					System.out.print("Number is not duck number ");
			}
				
		}
}
