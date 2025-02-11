import java.util.Scanner;
class LengthEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.print("Enter number :");
		int num=sc.nextInt();
		int rev=0, rem=0,cnt=0;
		int r=0;


		for(int i=num;i>0;i/=10){
			rem=num%10;
			rev=rev*10+rem;
			cnt++;
			System.out.println("j"+cnt);
			
		}
		if(cnt%2==0){
			for(int i=rev;i>0;i/=10){
			r=i%10;
			System.out.println("j"+r);
			if(r%2!=0){
				r=r+1;
			System.out.println(r +" ");
	     	}
			}
		}else{
			for(int i=rev;i>0;i/=10){
			r=i%10;
		
			if(r%2==0){
				r=r+1;
			System.out.println(r +" ");
			}
	     	}
		}
	}
}


	/*	while(num>0){
			rem=num%10;
			cnt++;
			rev=rev*10+rem;
			num/=10;
		}
		
		if(cnt%2==0){
			while(rev > 0){
				r=rev%10;
				if(r%2!=0)
					r=r+1;
				System.out.print(r+" ");
			   rev/=10;
			}
		}else{
			while(rev>0){
			r=rev%10;
			if(r%2==0)
					r=r+1;
			System.out.print(r+" ");
			rev/=10;   */
		
	  
	

