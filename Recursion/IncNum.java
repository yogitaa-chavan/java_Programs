class IncNum 
{
	public static void main(String[] args) 
	{
		int n=10;
		IncRec(n);
	}
	public static void IncRec(int n){
		if(n==0){
			return;
		}
		IncRec(n-1);
		System.out.println(n);
	}
}
