class HarshadNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isHarshadNum(3,3,0));
	}
	public static boolean isHarshadNum(int n,int temp,int s){
		return temp==0? n%s==0 : isHarshadNum(n,temp/10,s+temp%10);
	}
}
