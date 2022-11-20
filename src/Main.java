public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Expressions and Statements          --");
        System.out.println("-- Code Blocks                         --");
        System.out.println("-----------------------------------------");

/*        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);*/

        //Challenge
        //Create a method called displayHighScorePosition
        //it should a players name as parameter, and a 2nd parameter as a position in the high score table
        //You should display the players name along with a message like "managed to get into position "and the
        //position they got and a further message "on the high score table"

        //Create a 2nd method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return an int
        //1 if the score is >1000
        //2 if the score is >500 and < 1000

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jeff", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jing", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kyle", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Liam", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Kirk", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Anne", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Edward", playerPosition);

        playerPosition = calculateHighScorePosition(999);
        displayHighScorePosition("999", playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerHighScorePosition ){
        System.out.println(playerName + " managed to get into position "
                                      + playerHighScorePosition + " on the high score table");
    }
    public  static int calculateHighScorePosition(int score){
        //int position = 0;
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500 ){
//            return 2;
//        } else if(score >= 100 ) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >=500){
            position = 2;
        } else if (score >=100){
            position = 3;
        }

        return position;
    }

        //public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /*public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
            int finalScore = -1;
            if (gameOver){
                finalScore = score + (levelCompleted * bonus);
                finalScore +=1000;
            *//*System.out.println("Game Over");
            System.out.println("Your final score was " + finalScore);*//*
            }
            return finalScore;
        }*/
    }