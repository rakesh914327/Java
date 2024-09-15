// java programm to extract individual digit and print Square of individual digit


public class Square_oid {
  public static void main(String[] args){
    int n=12345,res,prod=1;
    System.out.println("Given number is = "+ n);
    while(n>0){
      res=n%10;
      prod=res*res;
      n=n/10;
      System.out.println("Square of Individual digit "+res+" = "+prod);

    }
    
  }
  
}
