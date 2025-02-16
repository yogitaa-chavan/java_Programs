import java.util.*;
class TechNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int num=new Scanner(System.in).nextInt();
		int len=0, div=1;
		for(int i=num;i>0;i/=10)
			len++;
		if(len%2==0){
		for(int j=1;j<=len/2;j++)
			div*=10;
		int sum=num/div+num%div;
		int sqrt = sum*sum;
		System.out.println(num==sqrt? (num+" is a TECH number" ): (num+" is not a TECH number"));
		
		}else{
			System.out.println(num+" is not a TECH number");
		}
		
	}
}
