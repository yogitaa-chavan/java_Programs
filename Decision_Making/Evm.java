import java.util.Scanner;
class Evm 
{
	public static void main(String[] args) 
	{
		int bjp=0,cng=0,mns=0,aap=0,ss=0,nota=0;
		System.out.println();
		System.out.println("         Welcome");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a population : ");
		int pop = sc.nextInt();
		for(int i=0;i<pop;i++){
			System.out.println("****List of Parties****");
			System.out.println("1. BJP");
			System.out.println("2. congress");
			System.out.println("3. manase");
			System.out.println("4. aap");
			System.out.println("5. Shivsena");
			System.out.println("6. nota");
			System.out.println();
			System.out.println("Enter your option");
			int opt = sc.nextInt();
			
			if(opt>=1 &&opt<=6){
				if(opt==1){
					bjp++;
				System.out.println("Ache din ");

				}if(opt==2){
					cng++;
				System.out.println("Bharat todo");

				}
				if(opt==3){
					mns++;
				System.out.println("jay maharashtra");

				}if(opt==4){
					aap++;
				System.out.println("Muze aazad karo");

				}
				if(opt==5){
					ss++;
				System.out.println("ham hain sena");

				}if(opt==6){
					nota++;
					System.out.println("good dicision");

				}
			
			}
				if(!(opt>=1 && opt<=6)){
					i--;
					System.out.println("Invalid output");

				}
		}

				if(bjp>=cng && bjp>=mns && bjp>=aap && bjp>=nota && bjp>=ss){
					System.out.println("BJP has won by "+bjp+" votes");


				}
				if(bjp<=cng && cng>=mns && cng>=aap && cng>=nota && cng>=ss){
				System.out.println("Congress has won by "+cng+" votes");

				}
				if(mns>=cng && mns>=bjp && mns>=aap && mns>=nota && mns>=ss){
				System.out.println("Manase has won by "+mns+" votes");

				}
				if(ss>=cng && ss>=mns&& ss>=aap && ss>=nota && ss>=bjp){
				System.out.println("Shivsena has won by "+ss+" votes");

				}
				if(aap>=cng && aap>=mns && bjp>=aap && aap>=nota && aap>ss){
				System.out.println("AAP has won by "+aap+" votes");

		
			}

		}
	

}