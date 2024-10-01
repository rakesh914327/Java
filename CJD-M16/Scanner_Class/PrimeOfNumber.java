import java.util.*;

public class PrimeOfNumber {
  public static int Prime(int n){
    int res,product=0;
    while(n>0){
      res=n%10;
      int count=0;
      for(int i=1;i<=res;i++){
        if(res%i==0){
          count++;
        }
      }
      if(count==2){
        product=product*10;
        product=product+res;
      }
      n=n/10;
    }
    return product;
  }
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    int n1=Prime(n);
    int rev =n1;
    reverse(n1);
    System.out.println(reverse(n1));
  }
  public static int reverse(int n){
    int rev=0,res;
    while(n>0){
      res=n%10;
      rev=rev*10;
      rev=rev+res;
      n=n/10;
    }
    return rev;
  }

}
