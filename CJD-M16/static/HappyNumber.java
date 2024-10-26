import java.util.Scanner;
class  HappyNumber
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Eneter The Numnber : ");
		int n = obj.nextInt();
		while(n>9)
			{
			int sum=0,prod=1,res;
			while(n>0)
				{
				res=n%10;
				prod=res*res;
				n=n/10;
				sum=sum+prod;
				}
			n=sum;
			}
		System.out.println(n==1?"Happy Number":"Not a Happy Number");
	}
}
