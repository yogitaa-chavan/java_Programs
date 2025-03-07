class RotateNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=123;
		int rot=rotateNum(n);
		do{
			System.out.println(rot);
			rot=rotateNum(rot);
		}while(rot!=n);
		System.out.println(rot);
	}
	public static int rotateNum(int n){
		return ((n%10)*power(10,(count(n)-1))+(n/10));
	}
	public static int count(int n){
		int ct=0;
		for(int i=n;i>0;i/=10)
			ct++;
		return ct;
	}
	public static int power(int n, int cnt){
		int p=1;
		for(int i=0;i<cnt;i++){
			p*=n;
		}
		return p;
	}

}
