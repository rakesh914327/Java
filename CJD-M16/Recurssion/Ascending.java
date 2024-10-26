import java.util.Scanner;

public class Ascending{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = obj.nextInt();
    int res,sum=0;
    int c=count(n,0);
    System.out.println("Count of the Number is  : "+c);
    System.out.println(asc(n,c));
  }
  public static int asc(int n, int c){
    int sum=0,prod=1;
    while(n>0){
      int res = n%10;
      if(res==1){
        int c1=c-res;
        while(c1>0){
          prod=prod*10;
          c1--;

        }
        sum=sum+(prod*res);
      }
      
      else if(res==3){
        int c3=c-res;
        while(c3>0){
          prod=prod*10;
          c3--;

        }
        sum=sum+(prod*res);
      }
      n=n/10;
    }
    return sum;
  }
  public static int count(int n, int c){
    while(n>0){
      c++;
      n=n/10;
    }
    return c;
  }
}