class KaprekarNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isKaprekar(4879,4879));
	}
	public static boolean isKaprekar(int n,int temp){
		int seq=n*n;
		int div=div(n,1);
	//	int firsthalf = n/div;
	//	int secondHalf = n%div;
		return temp == (n/div+n%div);
	}
	public static int div(int n,int d){
		return n==0? d : div(n/10, d*10);
	}
}
