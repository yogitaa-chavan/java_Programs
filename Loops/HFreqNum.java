class HFreqNum 
{
	public static void main(String[] args) 
	{
		int num=14433324;
		int maxF=0;
		for(int i=0;i<=9;i++){
			int cnt=0;
			for(int j=num;j>0;j/=10){
				int digit=j%10;
				if(digit==i){
					cnt++;
				}
				
			}
			
			if(maxF<cnt)
					maxF=i;
		}
		System.out.println("Maximum frquecy digit is " +maxF);
		
	}
}
