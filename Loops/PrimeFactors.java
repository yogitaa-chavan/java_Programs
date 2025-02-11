import java.util.*;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++){
			if(num % i == 0){
				
				int cnt=0;
				for(int j=2;j<=Math.sqrt(i);j++){
					if(i % j == 0){
						cnt++;
						break;
					}
				}
					if(cnt==0){
							System.out.print(i+" ");
					}
					
			
				}
		}
		
	}
}




