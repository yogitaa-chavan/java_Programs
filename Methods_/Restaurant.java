import java.util.*;
class Restaurant
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for( ; ;){
			System.out.println();
			System.out.println("          JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Create Acccount");
			System.out.println("2. Exsisting User");
			int op=sc.nextInt();
			System.out.println();
			switch(op){
				case 1 : createAccount(sc);break;
				case 2 : loginAccount(sc); break;
			default : System.out.println("INVALID OPTION");
						break;
		  }
		}
	}
		public static void createAccount(Scanner sc)
			{
				System.out.println();
				System.out.println("    Registration");
				System.out.println();
				System.out.print("Enter your name : ");
				name  = sc.next();
				System.out.print("Enter contact : ");
				contact=sc.nextLong();
				sc.nextLine();
				System.out.print("Enter address : ");
				address=sc.nextLine();
				System.out.println();
				System.out.println("ACCOUNT CREATED SUCCESSFULLY");
		 }
		public static void loginAccount(Scanner sc){
			System.out.println();
			if(name==null){
				System.out.println("CREATE ACCOUNT FIRST ");
				return;
			}
			System.out.println();
			System.out.println(           "LOGIN");
			System.out.println();


			for(int attempts =3;attempts>=1;attempts--){
				System.out.println("UserName : ");
				String NewName = sc.next();
				System.out.println("Contact : ");
				long cont = sc.nextLong();
				if(NewName.equals(name) && cont==contact){
					//System.out.println("Login Successfully");
					homePage(sc);
				}else{
							System.out.println("INVALID CREDENTIALS");	
							System.out.println("Attempts left "+(attempts-1));
							System.out.println();		
					
				}
			}
			System.out.println("THANK YOU $ NEVER VISIT AGAIN");
			System.exit(0);
		}

		public static void homePage(Scanner sc)
	{
		for( ; ;){
			System.out.println("        Home");
			System.out.println();
			System.out.println("1. Menu");
			System.out.println("2.Order");
			System.out.println("3. Table Booking");
			System.out.println("4. Generate Bill");
			System.out.println("5. Logout");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt = sc.nextInt();

			switch(opt){
				case 1 : menu(sc); break;
				case 2 : order(sc); break;
				case 3 : tableBooking(); break;
				case 4 : billGenerate(); break;
				case 5 : System.out.println("THANK YOU AND VISIT AGAIN");System.exit(0);break;
				case 6 : System.out.println("YOU CHOOSE A WRONG OPTION");break;
			}
		}

	}
	public static void menu(Scanner sc){
		for( ; ;){
			System.out.println();
			System.out.println("          MENU");
			System.out.println();
			System.out.println("101 : Butter_Chicken = 450/-");
			System.out.println("102 : Chicken_Biryani = 400/-");
			System.out.println("103 : Shahi_Paneer = 300/-");
			System.out.println("104 : Mix_Veg = 400/-");
			System.out.println("105 : Roti = 35/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter an food id : ");
			int id = sc.nextInt();
			switch(id){
				case 101:{
					basket.add("101 : Butter_Chicken = 450");
					System.out.println("Butter Chicken insert inside the basket");
					break;
				}
				case 102:{
					basket.add("102 : Chicken_Biryani = 400");
					System.out.println("Chicken_Biryani insert inside the basket");
					break;
				}
				case 103:{
					basket.add("103 : Shahi_Paneer = 300");
					System.out.println("Shahi Paneer insert inside the basket");
					break;
				}
				case 104:{
					basket.add("104 : Mix_Veg = 400");
					System.out.println("Mix Veg insert inside the basket");
					break;
				}
				case 105:{
					basket.add("105 : Roti = 35");
					System.out.println("Roti insert inside the basket");
					break;
				}
				case 106 : return;
				default : {
					System.out.println("INVALID FOOD ID");
					break;
				}
			}
		}
	}
	public static void order(Scanner sc){
			System.out.println();
			System.out.println("			ORDERS");
			System.out.println();
			if(basket.size()==0){
				System.out.println("Basekt is empty add food items");
			}
			for(String foodItem : basket){
				System.out.println(foodItem);
			}

			System.out.println();
			System.out.println("1. cancel order");
			System.out.println("2. Remove food items");
			System.out.println("3. Proceed to payment");
			System.out.println();
			System.out.println("Enter your option");
			int opt = sc.nextInt();
			switch(opt){
				case 1 : {
					System.out.println("Order cancelled");
					basket.clear();
					break;
				}
				case 2 : {
					System.out.print("Enter foodId : ");
					int foodId = sc.nextInt();
					removefoodId(foodId);
					break;
				}
				case 3 : {
						billGenerate();
						break;
					//System.out.println();
				}
			}
	}
			public static void removefoodId(int foodId){
				System.out.println();
				ArrayList<String> dupBasket = new ArrayList<>(basket);
				int idx =0 ;
				boolean flag = false;
				for(String foodItem : dupBasket){
					String[] arr = foodItem.split(" ");
					if(arr[0].equals(foodId+""))
					{
						dupBasket.remove(idx);
						flag = true;
						System.out.println("FOOD ITEM REMOVED ");
					}
					idx++;
				}
				if(!flag)
					System.out.println("FOOD ITEM DOESN'T EXIST IN BASKET");
				basket = dupBasket;
			}
			public static void tableBooking(){
				System.out.println();
				System.out.println("       Table Booking");
				System.out.println();
			}
			public static void billGenerate()
			{
				double totBill = 0;
				for(String foodItem : basket){
					String[] arr = foodItem.split(" ");
					totBill +=Double.parseDouble(arr[4]);
				}
				System.out.println("Total Bill : "+totBill+"rs.");
			}
}
