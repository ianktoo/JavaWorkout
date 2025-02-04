public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp(true, 1): " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp(false, 2): " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp(true, 8): " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp(true, -1): " + shouldWakeUp(true, -1));

    }

    /**
     * There is a dog that likes to bark.
     * We need to wake up if the dog barks at nignt
     *
     */

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
         if(hourOfDay < 0 || hourOfDay > 23) {
             return false;
         } else return (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
}
