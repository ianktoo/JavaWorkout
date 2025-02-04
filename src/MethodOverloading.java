public class MethodOverloading {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(calculateScore("Jace",78));
        System.out.println(convertToCentimeters(6,0));
    }

    /**
     * Calculates player score.
     * @param playerName
     * @param score
     * @return
     */
    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " score is " + score);
        return score * 1000;
    }

    /**
     * Calculates anonymous player score.
     * @param score
     * @return
     */
    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    /**
     * Returns no player score
     * @return
     */
    public static int calculateScore() {
        return calculateScore("Anonymous", 0);
    }

    // 1 inch - 2.54 centimetres
    // 1 foot - 12 inches
    public static double convertToCentimeters(int inches) {
        return (double) inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(inches) + ((double) feet * 12 * 2.54);
    }
}
