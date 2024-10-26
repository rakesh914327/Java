public class Armstrong {
  public static void main(String[] args) {
    Armstrong(100000);
    
  }
  public static void Armstrong(int n) {
    int c=0;
    for(int i=1;i<=n;i++){
      int n1=i,d,sum=0;
      while(n1>0){
        d=n1%10;
        sum+=exp(d,count(i));
        n1/=10;
      }
      if(i==sum){
        c++;
      }
}
System.out.println("Armstrong number from 1-100000 "+c);
 }
public static int count(int n) {
  int c=0;
  while(n>0){
    c++;
    n/=10;
  
  }
  return c;
}

public static int exp(int m,int n){
  int pro=1;
  while(n>0){
    pro*=m;
    n--;
  }
  return pro;
}

}
