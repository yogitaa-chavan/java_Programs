/*import java.util.Scanner;
class Primee 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter a number  ");
		int cnt=0;
		int num=new Scanner(System.in).nextInt();
		for(int i=2;i<num;i++){ 
			boolean flag=true;
			for(int j=2;j<i;j++){
			if(i % j == 0){
				flag=false;
				break;

			}
			
		}
		if(flag){
		int n=i;
		boolean f=true;
		for(int k=2;k<n;k++){
			for(int j=n;j>0;j/=10){
				int rem=n%10;
				if(rem%k==0){
				cnt++;
			}


				/*if(rem%k==0 && rem!=1){
				f=false;
				break;
			}
		}
		
	}
	//if(f)
		
	}
}
				System.out.println(cnt);
}
}

*/




import java.util.Scanner;
class Primee 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter a number  ");
		int cnt=0;
		int num=new Scanner(System.in).nextInt();
		for(int i=2;i<num;i++){ 
			boolean flag=true;
			for(int j=2;j<i;j++){
			if(i % j == 0){
				flag=false;
				break;

			}
			
		}
		if(flag){
		int n=i;
		boolean f=true;
		for(int k=2;k<n;k++){
			int c=0;
			for(int j=n;j>0;j/=10){
				int rem=n%10;
				if(rem%k==0){
				c++;
			}

		} if(c==0){
			cnt++;
		}
		
	}
	//if(f)
		
	}
}
				System.out.println(cnt);
}
}