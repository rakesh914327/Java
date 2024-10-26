public class Disarium {
    public static void main(String[] args) {
      Disarium(100000);
      
    }
    public static void Disarium(int n) {
      int c=0;
      for(int i=10;i<=n;i++){
        int n1=i,d,sum=0,c1=count(i);
        while(n1>0){
          d=n1%10;
          sum+=exp(d,c1);
          n1/=10;
          c1--;
        }
        if(i==sum){
          System.out.println(i);
        }
  }
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
  

