// write a java programm to check given number is even or odd using conditional statements if else

class Even_Odd {
    public static void main(String[] args) {
        int num = 10;
        
        if(num%2==0){
            System.out.println("Given number " + num + " is a even number");
        }
        else{
            System.out.println("Given number " + num + " is a odd number");
        }
    }
}