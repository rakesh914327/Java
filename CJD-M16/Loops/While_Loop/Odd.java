// Write a java programm to print odd numberes from m to n

public class Odd {
  public static void main (String[] args){
    int m,n;
    m=1;
    n=100;
    while(m<=n){
      if(m%2==1){
        System.out.println(m);
      }
      m++;
    }
  }
  
}
