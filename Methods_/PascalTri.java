class PascalTri 
{
	public static void main(String[] args) 
	{
		pascalTri(6);
	}
	public static void pascalTri(int n){
		for(int i=0;i<n;i++){
			for(int sp=0;sp<n-i-1;sp++){
				System.out.print(" "+" ");
			}
			for(int st=0;st<=i;st++){
				System.out.print(facto(i)/(facto(st)*facto(i-st))+"  ");
					//System.out.print("* "+" ");
			}
			System.out.println();
		}
	}
	public static int facto(int n){
		int f=1;
		for(int i=n;i>0;i--)
			f*=i;
		return f;
	}
}
