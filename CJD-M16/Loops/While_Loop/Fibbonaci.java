/* A *Fibonacci number* is a number in the Fibonacci sequence, which is a series where each number is the sum of the two preceding ones. The sequence typically starts with 0 and 1.

### First few Fibonacci numbers:
[ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,....so on]

Each number is the sum of the two preceding ones:
- ( 1 = 0 + 1 )
- ( 2 = 1 + 1 )
- ( 3 = 1 + 2 )
- ( 5 = 2 + 3 )
- and so on. */

public class Fibbonaci {
  public static void main(String[] args) {
      int a=0,b=0,res=0;
      while(res<=1000){
          if(a==0){
              b++;
              System.out.println(a);
          }
          res = a+b;
          System.out.println(b);
          a=b;
          b=res;
      }
  }
}
