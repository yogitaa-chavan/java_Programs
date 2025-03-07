class TetrahedralNumber
{
	
	
    public static int tetrahedralNumber(int n) 
	{ 
		return (n * (n + 1) * (n + 2)) / 6; //formula
	} 
	 
	public static void main(String[] args) 
	{ 
		int n = 1; 
		  
		System.out.println(tetrahedralNumber(n)); 
	} 
}