// write a java programm to check given alphabet character is uppercase or lower case character

class Alphabet{
    public static void main(String[] args) {
        char ch ='a';
        
        if(ch>='A' && ch<='Z'){
            System.out.println("Given character "+ ch + " is a uppercase character");
        }
        else{
            System.out.println("Given character " + ch + " is a lowercase character");
        }
    }
}