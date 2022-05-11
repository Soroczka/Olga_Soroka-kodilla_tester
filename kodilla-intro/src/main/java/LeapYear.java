public class LeapYear {

    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean checkIsLeapYear(int year){

        if (year % 4 != 0){
            System.out.println(year % 4);
            return false;
        } else if (year % 100 != 0) {
            System.out.println(year % 100);
            return true;
        } else if (year % 400 != 0) {
            System.out.println(year % 400);
            return false;
        } else {
            return true;
        }
    }

    public int getYear() {
        return year;
    }


}

class AppLeapYear{

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(5556);
        if (leapYear.checkIsLeapYear(leapYear.getYear())){
            System.out.println("Przestępny");
        } else {
            System.out.println("Nie przestępny");
        }

    }

}
