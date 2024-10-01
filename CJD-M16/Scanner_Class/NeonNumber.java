// java programm to check neon number

/* Neon Number : A *neon number* is a number where the sum of the digits of its square is equal to the original number.

For example:
-Take the number 9. Square it: ( 9^2 = 81 ).
- Now, sum the digits of 81: ( 8 + 1 = 9 ), which is equal to the original number.
Thus, 9 is a neon number. */

import java.util.Scanner;

public class NeonNumber {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    int square=n*n;
    int sum=0;
    int res;

    while(square>0){
      res= square%10;
      sum = sum + res;
      square=square/10;

    }
    System.out.println(n==sum?n + " is a Neon Number":n+" is not a Neon Number");
  }
  
}
