import java.util.*;
class DecreasingOrder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int dup=0;
		boolean flag=true;
		for(int i=num;i>0;i/=10){
			int rem = i%10;
			if(dup<rem)
				dup=rem;
			else 
				flag=false;
		}
		if(flag)
			System.out.println(num+" is a decreasing order");
		else
			System.out.println(num+" is not a decreasing order");
	}
}
