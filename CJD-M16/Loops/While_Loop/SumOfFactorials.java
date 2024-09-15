// Sum of Factorials

public class SumOfFactorials{
	public static void main(String[] args) {
		
		int n=10, sum=0;
		
		for (int i=1;i<=n;i++){
		    
		    if (n%i==0){
		        
		        System.out.println(i);
		        sum=sum+i;
		        
		    }
		}
		System.out.println("sum of factors = " + sum);
	}
}