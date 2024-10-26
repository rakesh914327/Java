import java.util.Scanner;
public class caluclator1{
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    char operator = obj.next().charAt(0);
    int b= obj.nextInt();
    add(a,b);
    sub(a,b);
    mul(a,b);
  div(a,b);
mod(a,b);
  }

switch (operator) {
  case '+':
  public static void add(int a, int b){
    System.out.println(a+b);
  }
    break;
    case '-':
  public static void sub(int a, int b){
    System.out.println(a-b);
  }
    break;
    case '*':
  public static void mul(int a, int b){
    System.out.println(a*b);
  }
    break;
    case '/':
  public static void div(int a, int b){
    System.out.println(a/b);
  }
    break;
    case '%':
  public static void mod(int a, int b){
    System.out.println(a%b);
    break;
  }
}
}