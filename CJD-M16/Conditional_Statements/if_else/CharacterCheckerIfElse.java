

public class CharacterCheckerIfElse {
    public static void main(String[] args) {
        char character ='a';
        
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')||(character >= '0' && character <= '9')) {
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
                System.out.println(character + " is an alphabet.");
            }
            else{
                 System.out.println(character + " is a digit.");
            
        }
        }
        else {
            System.out.println(character + " is a special character.");
        }
        
    }
}
