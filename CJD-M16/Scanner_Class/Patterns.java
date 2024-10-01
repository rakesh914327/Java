import java.util.*;

public class Patterns{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=obj.nextInt();
    pattern1(n);
    System.out.println();
    pattern2(n);
    System.out.println();
    pattern3(n);
    System.out.println();
    pattern4(n);
    System.out.println();
    pattern5(n);
    System.out.println();
    pattern6(n);
    System.out.println();
    pattern7(n);
    System.out.println();
    pattern8(n);
    System.out.println();
    pattern9(10);
    System.out.println();
    pattern10(n);
    System.out.println();
    pattern11(n);
    System.out.println();
    pattern12(n);
    System.out.println();
    pattern13(n);
    System.out.println();
    pattern14(n);
    System.out.println();
    pattern15(n);
    System.out.println();
    pattern16(n);
    System.out.println();
    pattern17(n);
    System.out.println();
    
  }
  public static void pattern1(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void pattern2(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==3&&j==3){
          System.out.print("@");
        }
        else
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void pattern3(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==3||j==3){
          System.out.print("@");
        }
        else
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void pattern4(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||i==n){
          if(j%2==0){
            System.out.print("$");
          }
          else{
            System.out.print("*");
          }    
        }
        else
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void pattern5(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||j==5)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void pattern6(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==5||j==5){
        System.out.print("*");
        }
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void pattern7(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(j==1||i==5)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void pattern8(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||j==1)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void pattern9(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if((i==1||i==n)||(j==n/2||j==(n/2)+1))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void pattern10(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
    }
  }
  public static void pattern11(int n){
    for(int i=1;i<=n;i++){
      for(int j=i;j<=n;j++){
        System.out.print("*");
        }
        System.out.println();
    }
  }
  public static void pattern12(int n){
    int space=n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      space--;
      System.out.println();
    }
  }
  public static void pattern13(int n){
    int space=0;
    for(int i=n;i>=1;i--){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      space++;
      System.out.println();
    }
  }
  public static void pattern14(int n){
    int space=n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space--;
      System.out.println();
    }
  }
  public static void pattern15(int n){
    int space=0;
    for(int i=n;i>=1;i--){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space++;
      System.out.println();
    }
  }
  public static void pattern16(int n){
    int space=n-1;
    int space1=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space--;
      System.out.println();
    }
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=space1;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space1++;
      System.out.println();
    }
    
  }
  public static void pattern17(int n){
    int space=n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space--;
      System.out.println();
    }
    int space1=0;
    for(int i=n;i>=1;i--){
      for(int j=1;j<=space1;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      space1++;
      System.out.println();
    }
  }
}