import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter The Number For Operand 1 : ");
		Double op1 = obj.nextDouble();
		System.out.print("Enter The Operator to perform Operation: ");
		char operator=obj.next().charAt(0);
		System.out.print("Enter The Number For Operand 2 : ");
		Double op2 = obj.nextDouble();
		Double res;

		switch(operator){
			case '+':
				res=op1+op2;
				System.out.println(" Value Of " +op1 +" + "+op2+" = "+res);
			break;
			case '-':
				res=op1-op2;
				System.out.println(" Value Of " +op1 +" - "+op2+" = "+res);
			break;
			case '*':
				res=op1*op2;
				System.out.println(" Value Of " +op1 +" * "+op2+" = "+res);
			break;
			case '/':
				res=op1/op2;
				System.out.println(" Value Of " +op1 +" / "+op2+" = "+res);
			break;
			case '%':
				res=op1%op2;
				System.out.println(" Value Of " +op1 +" % "+op2+" = "+res);
			break;
		}



	}

}