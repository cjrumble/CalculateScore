package academy.learnprogramming;

public class Main {

//OVERLOADING METHODS / Started with 2 parameters, then 1, now none

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        newScore = calculateScore(75);
        System.out.println("New score is " + newScore);
        newScore = calculateScore();
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored no points");
        return 0;
    }

/*    JUST CHANGING THE PARM RETURN TYPE DOESN'T CHANGE METHOD SIGNATURE
    public static void calculateScore() {
        System.out.println("Unnamed player scored no points");
        return 0;
    } */

}
