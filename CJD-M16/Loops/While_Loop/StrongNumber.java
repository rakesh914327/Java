/* A *strong number* (also known as a factorial number) is a number in which the sum of the factorials of its digits equals the number itself.

For example:
- Take the number *145*.
  - The factorial of 1 is (1! = 1)
  - The factorial of 4 is (4! = 24)
  - The factorial of 5 is (5! = 120)
  - Now sum them: (1 + 24 + 120 = 145)

Since the sum of the factorials of its digits equals the original number, 145 is a strong number.

Some other strong numbers are 1,2,145,40585*/

public class StrongNumber {
  public static void main(String[] args){
    int num=40585,sum=0,n=num,res;
    while(n>0){
      res=n%10;
      int factorial=1;
      while(res>0){
        factorial=factorial*res;
        res--;
      }
      sum=sum+factorial;
      n=n/10;
    }
    System.out.println(num==sum?num+" is a Strong Number":num  + " is not a Strong Number");
  }
}
