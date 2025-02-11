class FreqOfDigit 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int num=12384321;
		for(int i=0;i<=9;i++){
			int cnt=0; //every time count 0 for new digit
			for(int j=num;j>0;j/=10){
				int rem=j%10;
				if(i==rem){
					cnt++;
				}
			}
			if(cnt!=0){
				System.out.println(i +" : "+cnt );
			}
		}
	}
}
