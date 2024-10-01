// Java program to print sum of n numbers

import java.util.Scanner;

public class Sum {
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();

    int sum=0;

    while(n<=100){
      sum=sum+n;
      n++;
    }
    
    System.out.println(sum);
  }
}
