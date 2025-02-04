public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(4.443,-4.4433));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        // Compare values up to the 3rd decimal place.
        // convert to long
        long aa = (long) (a * 1000);
        long bb = (long) (b * 1000);

        if (aa == bb) {
            return true;
        } else {
            return false;
        }

    }
}
