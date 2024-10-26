import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0, deposit, withdraw;
        String scenario = "9"; // Initialize scenario
        int c = 0;

        while (c < 3) {
            System.out.println("Enter The Pin Number : ");
            int pin = sc.nextInt();

            if (pin != 9999) {
                System.out.println("Entered Pin is Incorrect. Please Enter the Correct Pin.");
                c++;
            } else {
                sc.nextLine(); // Consume newline left-over
                while (!scenario.equals("4")) { // Use .equals for string comparison
                    System.out.println("Enter The Scenario: ");
                    System.out.println("1. To Check the Account Balance");
                    System.out.println("2. To Deposit the Money");
                    System.out.println("3. To Withdraw The Money");
                    System.out.println("4. Exit");
                    scenario = sc.nextLine();

                    switch (scenario) {
                        case "1":
                            System.out.println("Current Balance: " + balance);
                            break;
                        case "2":
                            System.out.println("Enter The Amount to Deposit: ");
                            deposit = sc.nextDouble();
                            balance += deposit;
                            System.out.println("Amount Deposited Successfully.");
                            sc.nextLine(); // Consume newline
                            break;
                        case "3":
                            System.out.println("Enter The Amount to Withdraw: ");
                            withdraw = sc.nextDouble();
                            if (withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Amount Withdrawn Successfully.");
                            } else {
                                System.out.println("Insufficient Funds. Please try again.");
                            }
                            sc.nextLine(); // Consume newline
                            break;
                        case "4":
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                }
                break; // Exit after successful operation
            }
        }
        
        if (c == 3) {
            System.out.println("You have entered an incorrect PIN 3 times.");
            System.out.println("Please try again after 24 hours.");
        }

        sc.close(); // Close scanner
    }
}
