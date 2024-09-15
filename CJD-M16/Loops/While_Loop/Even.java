// Write a java programm to print even numberes from m to n

public class Even {
  public static void main (String[] args){
    int m,n;
    m=1;
    n=100;
    while(m<=n){
      if(m%2==0){
        System.out.println(m);
      }
      m++;
    }
  }
  
}
