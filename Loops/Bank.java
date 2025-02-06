import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass1 = null;
        String userName1 = null;
        String address = null;
        long contact = 0L;
        double balance = 0.0;

        for (; ;) {
            System.out.println("        Welcome");
            System.out.println();
            System.out.println("1. Existing user ");
            System.out.println("2. Create New Account ");
            System.out.print("Choose your option ");
            int opt = sc.nextInt();
            System.out.println();
            if (opt == 1) {

                if (userName1 == null) {
                    System.out.println("Create Your Account First ");
                    continue;
                }

                System.out.println("Login");
                System.out.println();

                for (int i = 3; i >= 1; i--) {
                    System.out.println("Enter a user name ");
                    String userName = sc.next();
                    System.out.println("Enter a password");
                    String pass = sc.next();
                    if (userName.equals(userName1) && pass.equals(pass1)) {
                        home:
                        for (; ;) {
                            System.out.println();
                            System.out.println("Home Page");
                            System.out.println();
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Mini Statement");
                            System.out.println("5. Logout");
                            System.out.println();
                            System.out.print("Enter an option");
                            int opt2 = sc.nextInt();
                            switch (opt2) {
                                case 1: {
                                    System.out.println("Deposit");
                                    System.out.println();
                                    System.out.println("Enter an amount");
                                    double newBalance = sc.nextDouble();
                                    balance += newBalance;
                                    System.out.println("Amount deposited successfully");
                                    System.out.println();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Withdraw ");
                                    System.out.println();
                                    System.out.println("Enter the amount ");
                                    double withdraw = sc.nextDouble();
                                    System.out.println("Enter the pin");
                                    if (pass.equals(pass1)) {
                                        if (withdraw <= balance) {
                                            balance -= withdraw;
                                            System.out.println("Amount debited successfully");
                                        } else {
                                            System.out.println("Insufficient amount");
                                        }
                                    } else {
                                        System.out.println("Wrong pin ");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Check balance ");
                                    System.out.println();
                                    for (int j = 3; j >= 1; j--) {
                                        System.out.println();
                                        System.out.println("Enter the pin ");
                                        String pass2 = sc.next();
                                        if (pass2.equals(pass1)) {
                                            System.out.println("Total Amount : " + balance + " rs");
                                            continue home;
                                        } else {
                                            System.out.println("Wrong pin");
                                            System.out.println("Attempts left: " + (j - 1));
                                        }
                                    }
                                    System.out.println("Your account has been blocked for 24 hours ");
                                    System.exit(0);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Mini Statement: ");
                                    System.out.println();
                                    break;
                                }
                                case 5: {
                                    System.out.println("Thank you for using our app");
                                    System.out.println("Visit again ");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        System.out.println("Invalid credentials");
                        System.out.println("Attempts left: " + (i - 1));
                    }
                }
                System.out.println("Thank you & never visit again ");
                System.exit(0);
            } else if (opt == 2) {
                System.out.println("Account Creation: ");
                System.out.println("Enter your Name:");
                String name = sc.next();
                System.out.println("Enter your password");
                pass1 = sc.next(); // Store the password
                System.out.println("Enter your Contact");
                contact = sc.nextLong(); // Store the contact number
                sc.nextLine(); // Consume newline character after the long input
                System.out.println("Deposit Amount: ");
                balance = sc.nextDouble(); // Set an initial balance
                userName1 = name; // Store the username
                System.out.println("Account created successfully");
                System.out.println();
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
