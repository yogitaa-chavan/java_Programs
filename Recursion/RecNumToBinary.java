class RecNumToBinary 
{
	public static void main(String[] args) 
	{
		System.out.println(numToBin(8,""));
	}
	public static String numToBin(int n, String res){
		return n==0? res:numToBin(n/2, res=n%2+res);
	}
}
