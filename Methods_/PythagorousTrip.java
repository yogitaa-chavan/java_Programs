class PythagorousTrip  
{
	public static void main(String[] args) 
	{
		System.out.println(pythagorousTri(15 ,8 ,17));
	}
	public static boolean pythagorousTri(int n1,int n2,int n3){
		return (n1*n1)+(n2*n2)==(n3*n3);
	}
}
