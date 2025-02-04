public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        // Calculate
        double milesPerHour = kilometersPerHour / 1.609;

        // round if off
        long roundedMilesPerHour = Math.round(milesPerHour);

        // return it
        return roundedMilesPerHour;

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(Math.round(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
