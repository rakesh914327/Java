// write a java programm to check leap year

class LeapYear{
    public static void main(String[] args) {
        int year=1600;
        
        if((year%4==0 && year%100 !=0)||year%400==0 ){
            System.out.println(year + " year is a leap year");
        }
        else{
            System.out.println(year + " year is not  a leap year");
        }
    }
}