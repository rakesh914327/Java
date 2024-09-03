// write a java programm for Az,By,Cx.........Za

class Az{
    public static void main(String[] args) {
        char ch1='A';
        char ch2='z';
        
        while(ch1<='Z'){
            System.out.println(ch1+""+ch2);
            ch1++;
            ch2--;
        }
    }
}