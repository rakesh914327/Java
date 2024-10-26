import java.util.Scanner;

public class neon {
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the range number: ");
   int a=obj.nextInt();
neon(a);

  }

  public static void neon(int n) {
    for(int i=0;i<=n;i++){
int sq,d,sum=0;
sq=i*i;
while(sq>0){
  d=sq%10;
  sum+=d;
  sq/=10;
}
if(sum==i){
  System.out.println(i);
}

    }
    
  }
}
