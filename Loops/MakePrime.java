import java.util.Scanner;
class MakePrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num ");
		int num=new Scanner(System.in).nextInt();
		int cnt=0;
		boolean flag = false;
		for(int i=2;i<num/2;i++){
			
			if(num%i==0){
				num+=1;
				i=2;
			}
		}
		System.out.println("num "+num);
		
	}
}
