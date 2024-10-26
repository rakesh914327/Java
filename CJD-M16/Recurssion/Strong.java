class  Strong
{
	public static void main(String[] args) 
	{
		int n=145,temp=n;
		System.out.println(strong(n,0,temp)?"Strong Number":"Not a Strong Number");
	}
	public static boolean strong(int n,int sum,int temp){
		if(n>0){
			int fact =1;
			int res=n%10;
			sum=sum+factorial(res,fact);
			return strong(n/10,sum,temp);
		}
		return sum==temp;
	}
	public static int factorial(int res,int fact){
		if(res>1){
			fact=fact*res;
			return factorial(res-1,fact);
		}
		return fact;
	}
}
