import java.util.Scanner;

public class Perfect{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int n =obj.nextInt();
    int i=1;
    System.out.println(n==sum(n,i,0)?"Perfect Number":"Not a Perfect Number");
    
  }
  public static int sum(int n,int i,int sum) {
    if(i<=n){
      if(n%i==0){
        if(i!=n){
        sum=sum+i;
        }
      }
      i++;
      return sum(n,i,sum);
    }
    else{
      return sum;
    }
    
  }
}