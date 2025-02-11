import java.util.Scanner;
class PreNextPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Num : ");
		int num = new Scanner(System.in).nextInt(); //13
		int pprime=0;
		int nprime=0;
		
		for(int i=num-1;i>=2;i--){ //12-->2
			boolean flag = true;
			for(int j=2;j<i;j++){   //2-->i
			if(i%j==0){     //check prime
				flag = false;
				break;
			}
		}
		if(flag){
			pprime=i;
			break;
		}
	}
	for(int i=num+1; ;i++){  //14----->infinity until we found a prime
		boolean flag = true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				flag=false;
				break;
			}
		}
		if(flag){
			nprime=i;
			break;
		}
	}
		if(num-pprime < num-nprime)
			System.out.println(pprime +" "+ num);
		if(num-pprime > num-nprime)
			System.out.println(num +" "+ nprime);
			System.out.println(pprime+" "+num +" "+ nprime);

	}
}
