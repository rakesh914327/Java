public class Spy{
  public static void main(String[] args){
    spy(10000);
  }
  public static void spy(int n )
  {
    
    for( int i=1; i<=n; i++){
      int prod =1,d,sum=0,n1=i;
      while(n1>0){
        d=n1%10;
        sum+=d;
        prod*=d;
        n1=n1/10;
      }
      if (sum==prod){
        System.out.println(i);
      }
    }
  }
}