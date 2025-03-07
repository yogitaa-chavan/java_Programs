class RecTechNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isTechNum(2025,2025,div(2025,1,len(2025,0)),0,1));
	}
	 public static int len(int n, int len){
		return n==0?len : len(n/10, ++len);
	} 
	public static int div(int n,int d,int len){
		return n==len/2 ? d : div(n/10 , d*=10,len);
	}
	public static boolean isTechNum(int n, int temp, int div,int sum ,int sqrt){
		return temp==0?n==sqrt : isTechNum(n , temp/10,div, sum+=(n%div)+(n/div),sqrt=(sum*sum));
	}
}
