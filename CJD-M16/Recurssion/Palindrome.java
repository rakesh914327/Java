import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int n =obj.nextInt();
    System.out.println(n==rev(n,0)?"Palindrome Number":"Not a Palindrome Number");
    
  }
  public static int rev(int n, int rev) {
    if(n>0){
      int res=n%10;
    rev=rev*10;
    rev=rev+res;
    return rev(n/10, rev);
    }
    else{
      return rev;
    }
    
    
  }
}