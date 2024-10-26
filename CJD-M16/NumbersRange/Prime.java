import java.util.*;
public class Prime {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the range number: ");
   int a=obj.nextInt();
   prime(a);
}

public static void prime(int n) {
  for(int i=1;i<=n;i++){
    int c=0;
for(int j=1;j<=i;j++){

  if(i%j==0){
    c++;
  }
}
  if(c==2){
    System.out.println(i);
  }


  }
  
}
}
