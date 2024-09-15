// Java program to print sum of n numbers

public class Product {
  public static void main(String[] args){

    int n=1,product=1;

    while(n<=10){
      product=product*n;
      n++;
    }
    
    System.out.println(product);
  }
}
