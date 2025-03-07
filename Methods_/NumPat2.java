class NumPat2 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=n;i>=1;i--){
			
			for(int j=1;j<=2;j++){
				int a=i;
				for(int k=1;k<=i;k++){
			
					System.out.print(a--+"*");
				}
			}
			
			System.out.println();
		}
	}
}
