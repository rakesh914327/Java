// Java program to print sum of Even and Odd for a given range of numbers

public class EvenOdd {
  public static void main(String[] args){

    int n=1,Seven=0,Sodd=0;

    while(n<=10){
      if(n%2==0){
          Seven=Seven+n;
      }
      else{
          Sodd=Sodd+n;
      }
      n++;
    }
    
    System.out.println("Sum Of Even = "+Seven);
    System.out.println("Sum Of Odd = "+Sodd);
  }
}
