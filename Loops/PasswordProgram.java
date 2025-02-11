import java.util.Scanner;
class PasswordProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storePin=1234;
		int seconds=5000;
		

		outerLoop:
		for( ; ;){

			int attempts=3;
		do{

			System.out.print("Enter your pin ");
			int pin = sc.nextInt();
			if(storePin==pin){
				System.out.println("YOUR PHONE IS UNLOCK ");
				break outerLoop;
			}else{
				System.out.println("Wrong Pin");
				System.out.println("ATTEMPTS LEFT "+ attempts);
			}
			attempts--;
		}while(attempts>=1);
		System.out.println();
		System.out.println("PHONE IS DISABLED FOR "+(seconds/1000)+" seconds");
		Thread.sleep(seconds);
		seconds*=2;
		System.out.println();	
	}
}

}