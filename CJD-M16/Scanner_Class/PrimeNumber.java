/* Prime Number: A *prime number* is a natural number greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number can only be divided evenly by 1 and the number itself.

For example:
- 2, 3, 5, 7, 11, 13, 17, 19, 23, etc.

Note:
- The number 2 is the only even prime number.
- Numbers greater than 1 that are not prime are called *composite numbers* because they can be factored into smaller natural numbers. */

import java.util.Scanner;

class PrimeNumber{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    while(n<=100){
      int count = 0;
      int i;
      for(i=1;i<=n;i++){
        if (n>1 && n%i==0){
          count++;
        }
      }
     if(count==2){
      System.out.println(n);
     }
     n++;
    }
  }
}