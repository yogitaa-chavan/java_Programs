import java.util.*;
class BouncyNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int dup=9,dup1=0;
		boolean flag=true;
		boolean flag2=true;
		for(int i=num;i>0;i/=10){
			int rem=i%10;
			if(dup>=rem)
				dup=rem;
			else{
				flag=false;
				break;
			}
		}
		for(int i=num;i>0;i/=10){
			int rem = i%10;
			if(dup1<=rem)
				dup1=rem;
			else {
				flag2=false;
				break;
			}
		}

		if(flag)
			System.out.println(num+" is not a bouncy number");
		else
		{
			if(flag2)
				System.out.println(num+" is not a bouncy number");
			else
				System.out.println(num+" is a bouncy number");
	}
	}
}

