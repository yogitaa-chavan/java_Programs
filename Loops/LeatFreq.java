import java.util.*;
class LeatFreq 
{
	public static void main(String[] args) 
	{
		int num=12455512;
		int minF=0;
		int minC = 9;
		for(int i=0;i<=9;i++){
			int c=0;
			
			for(int j=num;j>0;j/=10){
				int digit=j%10;

				if(digit==i)
					c++;
				
			}
			/* if(c==0){
				System.out.println(i+" : " +c);
			 }*/

			if(minC>c && c>0){
				minC=c;
				minF=i;
			}
		}
		System.out.println("Least frequency digit is "+ minF);
	}
}

