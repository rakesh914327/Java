public class Xylem {
  public static void main(String[] args){
    int n=1234;
    int n1=n%10;
    int n2=FirstExtreme(n);
    int n3=n1+n2;
    int n4=n/10;
    int n5=rev(n4);
    int res=0,sum=0;
    while(n5>0){
      res=n5%10;
      sum=sum+res;
      n5=n5/10;
    }
    System.out.println(n3==sum?"Xylem":"not Xylem");
  }
  public static int FirstExtreme(int n){
    int res,rev=0,n2;
    while(n>0){
      res=n%10;
      rev=rev*10;
      rev=rev+res;
      n=n/10;
    }
    n2=rev%10;
    return n2;
  }
  public static int rev(int n){
    int res,reverse=0,n1;
    while(n>0){
      res=n%10;
      reverse=reverse*10;
      reverse=reverse+res;
      n=n/10;
    }
    n1=reverse/10;
    return n1;
  }
}
