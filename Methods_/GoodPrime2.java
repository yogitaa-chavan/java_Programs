class GoodPrime2 
{
	public static void main(String[] args) 
	{
		int n=30;
		boolean flag1=true;
		boolean f=true;
		for(int i=2;i<n;i++){
			flag1=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag1=false;
					break;
				}
			}
			if(flag1){
				int num=i;
				if(num>9){
				for(int j=num;j>0;j/=10){
					f=true;
					int rem=j%10;
						if(rem==1){
							f=false;
							break;
						}
						
						for(int k=2;k<rem;k++){
							if(rem%k==0){
								f=false;
								break;
							}
						}
						
					}
					if(f)
							System.out.print(i+" ");
				}else
					System.out.print(i+" ");
					
			}
		}
		
	}
}
