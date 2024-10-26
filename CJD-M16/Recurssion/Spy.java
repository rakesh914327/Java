import java.util.Scanner;

public class Spy{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int n =obj.nextInt();
    int prod=prod(n,1);
    int sum=sum(n,0);
    System.out.println(sum==prod?"Spy Number":"Not a Spy Number");
  }
  public static int prod(int n,int prod){
    if(n>0){
    int res = n%10;
    prod = prod *res;
    return prod(n/10,prod);
    }
    else{
      return prod;
    }
  }
  public static int sum(int n,int sum){
    if(n>0){
      int res = n%10;
      sum = sum+res;
      return sum(n/10,sum);
      }
      else{
        return sum;
      }
    
  }
}