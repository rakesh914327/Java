// java programm to extract individual digit and print prod of individual digit


public class Poid {
  public static void main(String[] args){
    int n=12345,prod=1,res;
    while(n>0){
      res=n%10;
      prod = prod*res;
      n=n/10;

    }
    System.out.println(prod);
  }
  
}
