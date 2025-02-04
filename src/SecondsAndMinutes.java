public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(600,59));
    }

    /*
    1 h - 60 minutes/3600 seconds
    1 m - 60 seconds
     */
    public static String getDurationString(int seconds){
        int hours = 0, minutes = 0, remSeconds = 0;

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
            return "Invalid number time duration.";
        }

        int totalSeconds = seconds + (minutes * 60);

        return getDurationString(totalSeconds);
    }
}
