import java.util.*;

public class HarshadhNumber {
  public static int Harshadh(int n){
    int n1=n,res,sum=0;
    while(n1>0){
      res=n1%10;
      sum=sum+res;
      n1=n1/10;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    int sum=Harshadh(n);
    System.out.println(n%sum==0?"Harshadh Number":" Not hrashadh Number");
  }
}
