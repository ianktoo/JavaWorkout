public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Ian Too", 500);
        System.out.println("new score is: " + newScore);

        int unnamedScore = calculateScore(700);
        System.out.println("unnamed new score is: " + unnamedScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " score is " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score is: " + score);
        return score * 1000;
    }
}
