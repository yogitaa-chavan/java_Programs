class RecStrongNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isStrongNum(145,145,0));
	}
	public static boolean isStrongNum(int n,int temp,int sum){
			return temp==0 ? (n==sum) : isStrongNum(n,temp/10,sum+(facto(temp%10)));
	}
	public static int facto(int n){
		if(n==0) return 1;
		return n*facto(n-1);
	}
	
}
