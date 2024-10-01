// Sum of Factorials

import java.util.Scanner;

public class SumOfFactorials{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
		
		int sum=0;
		
		for (int i=1;i<=n;i++){
		    
		    if (n%i==0){
		        
		        System.out.println(i);
		        sum=sum+i;
		        
		    }
		}
		System.out.println("sum of factors = " + sum);
	}
}