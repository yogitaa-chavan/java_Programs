class RecSpyNum 
{

	public static void main(String[] args) 
	{
		System.out.println(isSpy(22));
	}
	public static boolean isSpy(int n){
		return mul(n)==sum(n);
	}
	public static int mul(int n,int res){
		return n==0 ? res : mul(n/10, res*(n%10));
	}
	public static int mul(int n,int res){
		return n==0 ? res : sum(n/10, res+(n%10));

	}
}
