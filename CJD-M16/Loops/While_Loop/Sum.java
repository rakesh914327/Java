// Java program to print sum of n numbers

public class Sum {
  public static void main(String[] args){

    int n=1,sum=0;

    while(n<=100){
      sum=sum+n;
      n++;
    }
    
    System.out.println(sum);
  }
}
