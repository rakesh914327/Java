import java.util.*;
public class AtmMachine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double balance=0,deposit,withdraw;
    int scenario = 0;
    int c=0;

    while(c<3){
      System.out.println("Enter The Pin Number : ");
      int pin = sc.nextInt();
      if(pin != 9999){
        System.out.println("Entered Pin is Incorrect Please Enter the Correct Pin");
        c++;
      }
      else{
        while(scenario!=4){
          System.out.println("Enter The Scenario: ");
          System.out.println("1. To Check the Account Balance");
          System.out.println("2. To Deposit the Money");
          System.out.println("3. To Withdraw The Money");
          System.out.println("4. Exit");
          scenario=sc.nextInt();
          switch(scenario){
            case 1:
            System.out.println("Current Balance : "+ balance);
            break;
            case 2:
            System.out.println("Enter The Amount to Deposit : ");
            deposit=sc.nextDouble();
            balance=balance+deposit;
            System.out.println("Amount Deposited Successfully : ");
            break;
            case 3:
            System.out.println("Enter The Amount to Withdraw : ");
            withdraw=sc.nextDouble();
            if(withdraw<=balance){
              balance=balance-withdraw;
            System.out.println("Amount Withdrawn Successfully :");
            }
            else{
              System.out.println("Insufficient Funds Please try Again");
            }
            break;
            case 4:
              System.out.println("Exiting...");
            break;
            default:
              System.out.println("Invalid option. Please try again.");
            break;
          }

        }
        break;
      }
    }
    if(c==3){
      System.out.println();
      System.out.println("you have Entered Incorrect Pin 3 times");
      System.out.println("Please Try Again After 24Hrs");
    }
  }
}
