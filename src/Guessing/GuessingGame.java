package Guessing;

public class GuessingGame {
    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        boolean p1right = false;
        boolean p2right = false;
        boolean p3right = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ... guess what it is!");
        System.out.println("The number is " + targetNumber);

        while(!(p1right || p2right || p3right) ){

            System.out.println("Player 1 guessed : "+ p1.getGuess());
            System.out.println("Player 2 guessed : "+ p2.getGuess());
            System.out.println("Player 3 guessed : "+ p3.getGuess());

            if(p1.getGuess()==targetNumber){
                p1right=true;
            }
            if(p2.getGuess()==targetNumber){
                p2right=true;
            }
            if(p3.getGuess()==targetNumber){
                p3right=true;
            }
            if (p1right || p2right || p3right ){
                System.out.println("We have winner(s)!");
                System.out.println("Is player one right? : " + p1right);
                System.out.println("Is player two right? : " + p2right);
                System.out.println("Is player three right? : " + p3right);
            }else{
                System.out.println("You'll have to try again!");
                p1.setGuess((int)(Math.random()*10));
                p1.stateGuess();
                p2.setGuess((int)(Math.random()*10));
                p2.stateGuess();
                p3.setGuess((int)(Math.random()*10));
                p3.stateGuess();
            }

        }

    }


}
