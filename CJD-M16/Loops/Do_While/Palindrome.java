public class Palindrome{
public static void main(String[] args){

		int n= 121,rev=0,res,n1=n;

		while(n>0){
		
			res=n%10;
			rev=rev*10;
			rev=rev+res;
			n=n/10;
		}
		
		System.out.println( rev==n1?n1+" is a palindrome":n1+" is not a palindrome"); 
	}
}