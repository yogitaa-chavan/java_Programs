class RecSpyN
{

	public static void main(String[] args) 
	{
		System.out.println(isSpy(1245));//for 22 true
	}
	public static boolean isSpy(int n){
		return mul(n,1)==sum(n,0);
	}
	public static int mul(int n,int res){
		return n==0 ? res : mul(n/10, res*(n%10));
	}
	public static int sum(int n,int res){
		return n==0 ? res : sum(n/10, res+(n%10));

	}
}
