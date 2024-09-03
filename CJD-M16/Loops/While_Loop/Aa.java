// write a java programm for Aa,Ba,Cc.........Zz

class Aa {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='a';
        
        while(ch1<='Z'){
            System.out.println(ch1+""+ch2);
            ch1++;
            ch2++;
        }
    }
}