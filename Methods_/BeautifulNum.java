class BeautifulNum 
{
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println(isBeutifulN(n));
	}
	public static boolean isBeutifulN(int n){
		int newN=lastDgt(n,0);
		if(count(newN) > 1) n=newN;
		return lastDgt(n,0)==1;
	}
	public static int lastDgt(int n,int sqSum){
		return n==0? sqSum : lastDgt(n/10 , sqSum+=(n%10)*(n%10));
	}
	public static int count(int n){
		int ct=0;
		for(int i=n;i>0;i/=10)
			ct++;
		return ct;
	}
}
