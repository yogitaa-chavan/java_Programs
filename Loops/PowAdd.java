class PowAdd
{
	public static void main(String[] args) 
	{
		int pow=2;
		int res=0;
		for(int i=0,num=2;i<5;i++){
			System.out.print((pow+num) +" ");
			pow=1;
			for(int j=1;j<=2;j++){
				pow*=num;
			}
			pow=pow+2;
		}
		//System.out.println("Hello World!");
	}
}

