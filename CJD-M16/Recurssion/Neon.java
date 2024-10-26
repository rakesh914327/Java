import java.util.Scanner;

public class Neon{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int n =obj.nextInt();
    int sum=0,sq=n*n;
    System.out.println(n==neon(sum,sq)?"Neon Number":"Not Neon Number");
  }
  public static int neon(int sum,int sq){
    if(sq>0){
    int res=sq%10;
    sum=sum+res;
    return neon(sum,sq/10);
    }
    else{
      return sum;
    }
  }
}