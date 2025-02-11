import java.util.Scanner;
class PerfectSq
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int n=sc.nextInt();
		boolean flag=false;
		//System.out.println("Enter power :");
		//int p=sc.nextInt();
		int op=1;

		for(int i=1;i<n;i++){
			if(i*i>n)
				break;
			if(i*i==n){
					flag=true;
					System.out.print(n + "is a perfect sq ");
					break;
					
				}
			}
			if(!flag)
				System.out.print(n+" is not a perfect sq ");
		}
	}




