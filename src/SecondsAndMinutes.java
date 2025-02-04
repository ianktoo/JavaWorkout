public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    /*
    1 h - 60 minutes/3600 seconds
    1 m - 60 seconds
     */
    public static String getDurationString(int seconds){
        int hours = 0, minutes, remSeconds = 0;

        if(seconds < 0){
            return "Invalid seconds.";
        }

        // Convert seconds to hours, minutes and remaining seconds
        minutes = seconds / 60;
        remSeconds = seconds % 60;
        if (minutes > 59){
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        return hours + "h " + minutes + "m " + remSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds){

        // Run a check on invalid seconds and minutes
        if(minutes < 0 || seconds < 0 || seconds >= 60){
            return "Invalid number time duration. Time must be positive. Seconds must be > 0 but less than 60.";
        }

        int totalSeconds = seconds + (minutes * 60);

        return getDurationString(totalSeconds);
    }


    public static void printYearsAndDays(long minutes){

        long hours, days, years, remainingDays;

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {

            // calculate number of hours
            hours = minutes / 60;

            // Calculate days
            days = hours / 24;

            // calculate years
            years = days / 365;

            // calculate remaining days
            remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(!summer && (temperature >= 25 && temperature <= 35)){
            return true;
        } else if(summer && (temperature >= 25 && temperature <= 45)){
            return true;
        } else {
            return false;
        }
    }
}
