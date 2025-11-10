package mathematics;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(
                LeapYear.solutionOneIf(2025)
        );
    }


    public static boolean solutionOneIf(int year) {
        if (String.valueOf(year).length() != 4) return false;
        return ((year % 4 == 0) && year % 100 != 0) || ((year % 4 == 0) && year % 400 == 0);
    }

}
