// write a java programm to check given Alphabet is Vowel or Cononant

class Vowel_Consonant{
    public static void main(String[] args) {
        char ch ='i';
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch + " is consonant");
        }
    }
}