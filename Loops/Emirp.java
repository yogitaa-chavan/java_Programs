import java.util.Scanner;
class Emirp 
{
	public static void main(String[] args) 
	{
		int rev=0;
		System.out.print("Enter number : ");
		
		int n = new Scanner(System.in).nextInt();
		boolean f=true;
		for(int j=2;j<n;j++){
			if(n%j==0){
				f=false;
				break;
			}
		}
		
			for(int i=n;i>0;i/=10){
				int d = i%10;
				rev=rev*10+d;
			}
			boolean ff=false;
			for(int j=2;j<rev;j++){
				if(rev%j==0){
					ff=true;
					//System.out.println("Number is Emirp");
					break;
				}
			}

		if(f && !ff)
			System.out.println("num is empirp");
		else{
			System.out.println("num is not a emirp");
		}
	}
}

