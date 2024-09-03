

public class CharacterChecker {
    public static void main(String[] args) {
        char character ='1';
        
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is an alphabet.");
        } else if (character >= '0' && character <= '9') {
            System.out.println(character + " is a digit.");
        } else {
            System.out.println(character + " is a special character.");
        }
        
    }
}
