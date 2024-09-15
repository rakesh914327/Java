class Factors{
  public static void main(String[] args){
    int n=11,count=0;
      for(int i=1;i<=n;i++){
        if (n>1 && n%i==0){
          count++;        
        }
      }
      if(count==2){
        System.out.print(n);
      }
  }
}