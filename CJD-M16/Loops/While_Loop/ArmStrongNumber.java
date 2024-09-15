

/* ARMSTRONG NUMBER : An *Armstrong number* (also known as a *narcissistic number* or *pluperfect number*) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

For example:
- *153* is an Armstrong number:
  - It has 3 digits, so each digit is raised to the power of 3.
  - (1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)
  
Another example:
- *370*:
  - (3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 37\)

Thus, 153 and 370 are Armstrong numbers. */

public class ArmStrongNumber {
  public static void main(String[] args){
    int num=153,sum=0,n=num,res;
    while(n>0){

      int product=1;
      res=n%10;
      product=res*res*res;
      sum=sum+product;
      n=n/10;

    }
    System.out.println(num==sum? num + " is a Arm Strong Number":num + " is not a Arm Strong Number" );
  }
  
}
