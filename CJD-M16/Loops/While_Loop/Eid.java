// java programm to extract individual digit


public class Eid {
  public static void main(String[] args){
    int n=12345,res;
    while(n>0){
      res=n%10;
      n=n/10;
      System.out.println(res);

    }
    
  }
  
}
