class AbundantNum 
{
	public static void main(String[] args) 
	{
		int n=12;
		System.out.println(isAbundantNum(n));
	}
	public static boolean isAbundantNum(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(n<sum) return true;
		return false;
	}
}
