public class Palindrome {
  public static boolean Palindrome(int n){
    int rev=0,res;
    int n1=n;
    while(n1>0){
      res=n1%10;
      rev=rev*10;
      rev=rev+res;
      n1=n1/10;
    }
    return n==rev;
  }
  public static void main(String[] args){
    int n=121;
    System.out.println(Palindrome(n)?"Palindrome":"Not Palindrome");
  }
}
