class Method1 
{
	public static void main(String[] args) 
	{
		System.out.println("prime number");
		prime();
		System.out.println("fibonaci number");
		fibo();
		System.out.println("factorial number");
		fact();
		palindrome(121);
		armstrong(153);
		
	}
	public static void prime(){
		int n=18;
		boolean flag=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(n+" is a prime number");
		}else{
			System.out.println(n+" is not a prime number");
		}
				System.out.println();

	}
	
		public static void fibo(){
		int n=5,f=0  , sec=1,  sum=0;
		
		for(int i=0;i<=n;i++){
			System.out.print(f+" ");
			sum=f+sec;
			f=sec;
			sec=sum;
		}
		System.out.println();
		System.out.println("Fibonacii number of "+n +" is "+sum);
		System.out.println();

	}

	public static void fact(){
		int n=5,f=1;
		
		for(int i=1;i<=n;i++){
			
			f*=i;
		}
		
			System.out.println("Factorial number of "+n +" is "+f);
			System.out.println();
	
	}
	public static void palindrome(int num){
		int rev=0;
		
		for(int i=num;i>0;i/=10){
			int rem=i%10;
			rev=rev*10+rem;

		}
		
		if(rev==num){
			System.out.println(num+" is a palindrome number");
		}else{
			System.out.println(num+" is not a palindrome number");
		}
			System.out.println();
	
	}
		public static void armstrong(int num){
		int temp=num,len=0,sum=0;
		
		for(int i=num;i>0;i/=10)
			len++;

		while(num>0){
			int rem=num%10;
			int p=1;
			for(int i=1;i<=len;i++)
				p*=rem;
			sum+=p;
			num/=10;
		}
		
		if(temp==sum){
			System.out.println(temp+" is a armstrong number");
		}else{
			System.out.println(temp+" is not a armstrong number");
		}
	}
}