// find given number is perfect or not

/* A *perfect number* is a positive integer that is equal to the sum of its proper divisors (excluding itself).

For example:
- *6* is a perfect number because its divisors are 1, 2, and 3, and ( 1 + 2 + 3 = 6 ).
- *28* is also a perfect number because its divisors are 1, 2, 4, 7, and 14, and ( 1 + 2 + 4 + 7 + 14 = 28 ).

The first few perfect numbers are 6, 28, 496, and 8128. */

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++){
		    
		    if (n%i==0){
		        System.out.println(i);
		        if (i<n){
		            sum=sum+i;
		            
		        }
		    }
		}
		    
		    System.out.println(n==sum?n+" is a perfect number":n+" is not a perfect number");
		}
		
	}