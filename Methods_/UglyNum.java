class UglyNum 
{
	public static void main(String[] args) 
	{
		int num=15;
		boolean flag=true;
		while(num!=1){
			if(num%5==0)
				num/=5;
			else if(num%3==0)
				num/=3;
			else if(num%2==0)
				num/=2;
			else{
				flag=false;
				break;
			}
			
			}
			if(flag)
				System.out.println("ugly num");
			else
				System.out.println("Not ugly num");
	}
}
