import java.util.Scanner;
class CntNeon 
{
	public static void main(String[] args) 
	{
		for(int num=1;num<10000;num++){
		int sum=0;
		int sqrt=num*num;
		while(sqrt>0){
			int rem=sqrt%100;
			sum+=rem;
			sqrt/=100;
		}
		if(sum==num)
			System.out.println(num);
		
		}
	}
}
