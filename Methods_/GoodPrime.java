import java.util.*;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num : ");
		int n = new Scanner(System.in).nextInt();
		boolean f= true;
		for(int i=1;i<n;i++){
			if(isPrime(i)){
					for(int j=i;j>0;j/=10){
						f=true;
						if(isPrime(j%10)==false){
							f=false;
							break;
						}
				}
				 if(f)
					System.out.print(i+" ");
		}		
	  }	 
	}
	public static boolean isPrime(int n){
		if(n==1) return false;
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
			}
			
		return true;		
	}	
}
