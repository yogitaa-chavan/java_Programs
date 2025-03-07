class CurrencyCon
{
	public static void main(String[] args) 
	{
		
		System.out.println("Main method starts");
		rupeeToDollar(100);

		System.out.println("Main method ends");
	}
	public static void rupeeToDollar(double rupee){
		System.out.println("rupeeToDollar starts ");
		double dollar = rupee/85.15;
		System.out.println("Dollar "+dollar);

		dollarToEuro(dollar);
		System.out.println("rupeeToDollar end ");

	}
	public static void dollarToEuro(double dollar){
		System.out.println("dollarToEuro starts ");
		double euro = dollar * 0.95;
		System.out.println("Euro "+euro);
		euroToDirhams(euro);
		System.out.println("dollarToEuro end ");

	}
	public static void euroToDirhams(double euro){
		System.out.println("euroToDirhams start ");
		double dirhams = euro*3.85;
		System.out.println("Dirhams : "+dirhams);
		System.out.println("euroToDirhams end ");

	}
}
