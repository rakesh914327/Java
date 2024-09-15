// java Programm to find Factorial of Given Number;

public class Factorial {
  public static void main(String[] args){

    int n = 20,product=1;

    while(n>0){
      product=product*n;
      n--;
    }
    System.out.println(product);
  }
  
}
