import java.util.*;
class PrimeFactors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		factors(n);
	}
	public static void factors(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				if(prime(i)==true)
					System.out.print(i+" ");
			}
		}	
	}
	public static boolean prime(int n){
			for(int j=2;j<n;j++){
				if(n%j==0) return false;
			}
		return true;
	}
}
