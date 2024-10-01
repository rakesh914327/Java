import java.util.Scanner;

public class Armstrong {
  public static boolean ArmStrong(int n){
    int res,n1=n,sum=0;
    while(n1>0){
      res=n1%10;
      int product = 1;
      int count = Count(n);
      for(int i=1;i<=count;i++){
        product=product*res;
      }
      sum=sum+product;
      n1=n1/10;
    }
    return n==sum;
  }
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    System.out.println(ArmStrong(n)?"ArmStrong Number":"Not ArmStrog Number");
  }
  public static int Count(int n){
    int res,count=0;
    while (n>0){
      res=n%10;
      n=n/10;
      count++;
      
    }
    return count;
  }
}
