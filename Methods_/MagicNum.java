class MagicNum 
{
	public static void main(String[] args) 
	{
		int num=37, sum=0;
		while(sum!=1)
		{
			for(int i=num;i>0;i/=10)
			{
				int dgt=i%10;
				sum+=dgt;
			}
			//tSystem.out.println(sum + " " + num);	

			if(sum==1 || sum<9)
				break;
			else
				num = sum;

			sum=0;
		}
		if(sum==1)
			System.out.println("Magic Num");
		else
			System.out.println("Not magic Num");
	}
}
