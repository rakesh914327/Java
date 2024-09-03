// write a java programm to check given Character or not

class Alphabet_Character{
    public static void main(String[] args) {
        char ch ='!';
        
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.println("Given character "+ ch + " is a Alphabet");
        }
        else{
            System.out.println("Given character " + ch + " is not an Alphabet");
        }
    }
}