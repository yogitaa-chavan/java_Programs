class NumSeries 
{
	public static void main(String[] args) 
	{
		int num=79;
		int p=29;
		System.out.print(num+" ");
		for(int i=0;i<6;i++){
			boolean f=true;
			for(int j=2;j<p;j++){
				if(p%j==0){
					f=false;
					break;
				}
			}
				if(f){
				num+=p;
				System.out.print(num+" ");
			}else{
				i--;
			}
			p++;
			
		}
		
	}
}

//Output--> 79 , 108 , 239 , 176 , 217 , 260
//difference  29 s   31    37    41    43 prime no