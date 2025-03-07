class TwinPrimeNum 
{
	public static void main(String[] args) 
	{
		System.out.println(twinPrimeNum(3,5));
	}
	public static boolean twinPrimeNum(int n1, int n2){
		if(isPrime(n1) && isPrime(n2) && isDiff(n1,n2)) return true;
		return false;
	}
	public static boolean isPrime(int n){
		int den=2;
		for( ; den<n;den++)
			if(n%den==0) return false;
		return true;
	}
	public static boolean isDiff(int n1,int n2){
		return Math.abs((n1-n2))==2;
	}
}
