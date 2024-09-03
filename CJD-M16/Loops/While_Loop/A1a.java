// write a java programm for A1a,B1a,C1c.........Z1z

class A1a {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='a';
        int n=1;
        
        while(ch1<='Z'){
            System.out.println(ch1+""+n+""+ch2);
            ch1++;
            ch2++;
        }
    }
}