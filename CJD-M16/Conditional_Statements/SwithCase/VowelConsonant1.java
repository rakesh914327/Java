public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':{System.out.println(ch + " is vowel");
                break;}
            case 'e':System.out.println(ch + " is vowel");
                break;
            case 'i':System.out.println(ch + " is vowel");
                break;
            case 'o':System.out.println(ch + " is vowel");
                break;
            case 'u':System.out.println(ch + " is vowel");
                break;
             case 'A':System.out.println(ch + " is vowel");
                break;
            case 'E':System.out.println(ch + " is vowel");
                break;
            case 'I':System.out.println(ch + " is vowel");
                break;
            case 'O':System.out.println(ch + " is vowel");
                break;
            case 'U':System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}