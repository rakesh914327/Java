import java.util.Scanner;

class BillingMachine{
  static int sum =0;
  public static void main(String[] args){
    System.out.println("--------------------------");
    System.out.println("|          MENU          |");
    System.out.println("--------------------------");
    System.out.println("|  dosa            40/-  |");
    System.out.println("|  poori           35/-  |");
    System.out.println("|  idly            30/-  |");
    System.out.println("|  bonda           35/-  |");
    System.out.println("|  vada            40/-  |");
    System.out.println("|  upma            30/-  |");
    System.out.println("|  uggani          30/-  |");
    System.out.println("|  coffee          15/-  |");
    System.out.println("|  tea             10/-  |");
    System.out.println("--------------------------");
    items();
    System.out.println("-------------------------------------------------");
    System.out.println("                            Total =   "+BillingMachine.sum+"/-");
    
  }
  public static int items(){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the Item : ");
    String item = obj.nextLine();
    switch(item){
      case "dosa":
      price(40,item,1);
      break;
      case "poori":
      price(35,item,1);
      break;
      case "idly":
      price(30,item,1);
      break;
      case "bonda":
      price(35,item,1);
      break;
      case "vada":
      price(40,item,1);
      break;
      case "upma":
      price(30,item,1);
      break;
      case "uggani":
      price(30,item,1);
      break;
      case "coffee":
      price(15,item,1);
      break;
      case "tea":
      price(10,item,1);
      break;
    }
    return sum;
  }
  public static void price(int p,String item, int pro){
    if(item!="enter"){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the Quantity : ");
    int q=obj.nextInt();
    pro=p*q;
    System.out.println(item +"(1)--------"+ p +"/-"+"   ("+q+"plates)"+"-------"+pro+"/-");
    BillingMachine.sum =BillingMachine.sum+pro;
    items();
    }

  }
}