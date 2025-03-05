class DecNNum 
{
	public static void main(String[] args) 
	{
		int n = 10;
		decNum(n);
		System.out.println();
	}
	public static void decNum(int n){
		if(n==1){
		System.out.println(n);
			return;
		}
		
		System.out.println(n);
		 decNum(n-1);
	}
}
