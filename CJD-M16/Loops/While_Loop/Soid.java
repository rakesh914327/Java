// java programm to extract individual digit and print summation of individual digit


public class Soid {
  public static void main(String[] args){
    int n=12345,sum=0,res;
    while(n>0){
      res=n%10;
      sum = sum + res;
      n=n/10;

    }
    System.out.println(sum);
  }
  
}
