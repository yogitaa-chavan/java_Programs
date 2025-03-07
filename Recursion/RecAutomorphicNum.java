class RecAutomorphicNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isAutomorphic(5,5,0));
	}
	public static boolean isAutomorphic(int n,int temp,int sq){
		return temp==0? n==sq%div(len(n,0),1): isAutomorphic(n,temp/10,sq+sq(n));
	}
	public static int sq(int n){
		return n*n;
	}
	public static int div(int n,int d){
		return n==0 ? d : div(--n,d*=10);
	}
	public static int len(int n,int len){
		return n==0 ? len : len(n/10,++len);
	}
}
