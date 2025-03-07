class PronicNum 
{
	public static void main(String[] args) 
	{
		int n = 20;
		System.out.println(pronicNum(n));
	}
	public static boolean pronicNum(int n){
		for(int i=1; ;i++){
			if(i*(i+1)==n) return true;
			else if(i*(i+1)>n) return false;
		}
	}
}
