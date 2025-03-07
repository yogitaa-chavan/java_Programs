import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{

		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		if((palindrome(num)==num) && isPrime(num)){
			System.out.println("Number is palindromic prime num");
		}else{
			System.out.println("Number is not palindromic prime num");
		}
	}
		public static int palindrome(int num){
			int rev=0;
			for(int i=num;i>0;i/=10){
				rev=rev*10+(i%10);

			}
			return rev;
		}
		public static boolean isPrime(int num){
			int den=2;
			for( ; den<num ; den++){
				if(num%den==0){
					break;
				}
			}
			return num==den;
		}
}
