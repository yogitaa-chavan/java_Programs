import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter a number  ");
		int c=0;
		int num=new Scanner(System.in).nextInt();
		for(int i=2;i<num;i++){ 
			boolean flag=true;
			for(int j=2;j<i;j++){
			if(i % j == 0){
				flag=false;
				break;

			}
			
		}
			int rem=0;
			if(flag){
				int n=i;
					boolean flag2=true;
				ol:
				while(n>0){
					rem = n % 10; //11
					if(rem==1){
						flag2=false;
						break;
					}
					flag2=true;
					for(int j=2;j<rem;j++){
						if(rem % j == 0){
							flag2=false;
							
							break ol;

						}
						
					}
					
				
			n/=10;
		}if(flag2 || c<=0){
			c++;
			System.out.print(i+" ");
		}
	
		}
	
	}
		System.out.println();
		System.out.print( "Total Numbers are " + c );
  }
}
