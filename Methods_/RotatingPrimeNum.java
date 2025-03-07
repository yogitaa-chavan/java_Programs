class RotatingPrimeNum 
{
	public static void main(String[] args) 
	{
		int n=101;

		System.out.println(isRotatingPrime(n));
	}
	public static boolean isRotatingPrime(int n){
		
		if(isPrime(n)){
			int rot=rotate(n);
			while(n!=rot && isPrime(n)){
				rot=rotate(rot);
			}
			return rot==n;
		}
		return false;
	}

	public static boolean isPrime(int n){
		int den = 2;
		for( ; den<n;den++)
			if(n%den==0) return false;
		return true;
	}
	public static int rotate(int n){
		return n%10*(power(10, count((n)-1)))+n/10;
	}
	public static int count(int n){
		int cnt=0;
		for(int i=n;i>0;i/=10)
			cnt++;
		return cnt;
	}
	public static int power(int n, int range){
		int p=1;
		for(int i=1;i<range;i++)
			p*=n;
		return p;
	}
}
