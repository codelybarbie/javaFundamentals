public class Challenge {
    public static void main(String[] args)
    {   boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        // if(score < 5000 && score > 1000) {
        //     System.out.println("Your score was less than 5000 but greater than 1000");
        // } 
        // else if(score < 1000){
        //     System.out.println("Your score was less than 1000");
        // }
        // else{ 
        //     System.out.println("Got here");
        // }
        //test comment
     if(newGameOver) {
         int finalScore = newScore + (newLevelCompleted * newBonus);
         finalScore += 1000;
         System.out.println("Your final score was " + finalScore);
     }

     //Print out a second score on the screen with the following
     //score set to 10000
     //levelCompleted set to 8
     //bonus set to 200
     //But make sure the first printout above still displays as well 

    



    }
}