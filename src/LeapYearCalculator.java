public class LeapYearCalculator {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        // Check if within range
        if(year >= 1 && year <= 9999) {
            // Calculate the leap year
            if(year % 4 == 0){
                //check again
                if(year % 100 == 0){
                    //check again
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
