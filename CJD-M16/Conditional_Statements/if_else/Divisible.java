// write a java programm to check given number isdivisible by 6 and 7 print yes if it is divisible by both 6 and 7 and print no if it is not by 6 and 7

class Divisible {
    public static void main(String[] args) {
        int num = 42;
        
        if(num%6 == 0 && num%7 == 0){
            System.out.println( " Yes it is divisible by both 6 & 7");
        }
        else{
            System.out.println("No it is not divisible by both 6 and 7");
        }
    }
}