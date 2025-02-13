class NumCubeSeries 
{
	public static void main(String[] args) 
	{

		int num=2;
		for(int i=2;i<7;i++){
			int cube = 1;
			for(int j=1;j<=3;j++){
				cube*=i;
				
			}
			System.out.print((cube+i)+" ");
		}
	}
}

/*int n=2,pow=2;
		for(int i=1;i<=5;i++){
			int p=1;
			for(int j=1;j<=3;j++){
				p*=n;
			}
			System.out.print(p+n+" ");
			n++;
			pow++;
		}*/

