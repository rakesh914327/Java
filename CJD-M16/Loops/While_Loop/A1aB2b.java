// write a java programm for A1a,B2a,C3c.........Z26z

class A1aB2b {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='a';
        int n=1;
        
        while(ch1<='Z'){
            System.out.println(ch1+""+n+""+ch2);
            ch1++;
            ch2++;
            n++;
        }
    }
}