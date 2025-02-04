public class TeenNumberChecker {
    public static void main(String[] args) {
        int brian = 12, lory = 17, dan = 20;
        System.out.println("There is a teen here: " + hasTeen(brian, lory, dan));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {

        if( isTeen(age1) || isTeen(age2) || isTeen(age3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int  age){

        if(age >= 13 && age <= 19){
            return true;
        } else {
            return false;
        }
    }
}
