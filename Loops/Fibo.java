class Fibo 
{
	public static void main(String[] args) 
	{
		int num=6;
		int f=0, s=1,sum=0;
		for(int i=0;i<num;i++){
			System.out.print(f + " ");
			sum=f+s;
			f=s;
			s=sum;

		}
		
	}
}
