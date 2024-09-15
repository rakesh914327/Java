// java Programm to find x^n of Given Number;

public class Exponent {
  public static void main(String[] args){

    int n = 10,exponent=2,res=1;
    while(exponent>0){
      res=n*n;
      exponent--;
    }
    System.out.println(res);
  }
  
}
