class RecRangePrimeNum 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<1000;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	//	System.out.println(isPrime(7));
	}
	public static boolean isPrime(int n){
		int den=2;
		for( ; den<n;den++)
			if(n%den==0)return false;
		return true;
	}
}
