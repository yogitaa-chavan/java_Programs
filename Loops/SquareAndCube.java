class SquareAndCube 
{
	public static void main(String[] args) 
	{
		
		for(int i=0,num=12,p=2;i<6;i++,num++){
			int pow=1;
			for(int j=1;j<=p;j++){
				pow*=num;
			}
			System.out.print(pow+" ");
		}
	}
}
