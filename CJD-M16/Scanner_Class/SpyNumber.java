// Java Program to print "Spy Number"

// SPY NUMBER: A spy number is a number where sum of its digits is eqaual to the product of its digits
// examples:123 ,132, 213, 231, 312, 321,1124ect.....

import java.util.Scanner;

public class SpyNumber {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    int res,prod=1,sum=0,n1=n;
    System.out.println("Given number is = "+ n);
    while(n>0){
      res=n%10;
      sum = sum + res;
      prod=prod*res;
      n=n/10;

    }
    System.out.println("Product of Individual digit = "+prod);
    System.out.println("Sum of Individual digit ="+sum);
    System.out.println( sum==prod ? n1+" is a Spy Number":n1+" is not a Spy Number");
  }
  
  
}
