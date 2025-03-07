import java.util.*;
class PrimeNumRange 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");	
		int n=new Scanner(System.in).nextInt();
		for(int i=2;i<n;i++){
			if(isPrime(i))
				System.out.print(i+" ");
		}
		
	}
	public static boolean isPrime(int num){
		int den=2;
		for( ; den<num; den++)
			if(num%den==0)return false;
		return true;
	}
}
