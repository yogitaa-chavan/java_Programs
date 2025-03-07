class CreatePythagorousTrip 
{
	public static void main(String[] args) 
	{
		int n=20;
		pythagourousTrip(n);
	}
	public static void pythagourousTrip(int n){
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				for(int k=1;k<n;k++){
					if(i*i + (j*j) == (k*k))
						System.out.println(i+" "+ j+" "+ k);
				}
			}
		}
	}
}
