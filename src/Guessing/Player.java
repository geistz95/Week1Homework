package Guessing;

public class Player {
    int guess = (int)(Math.random() * 10);

    public Player(){
        }
    public Player(int guess){
        this.guess=guess;
    }
    public void setGuess(int newGuess){
        this.guess=newGuess;
    }
    public int getGuess(){
        return guess;
    }
    public void stateGuess(){
        System.out.println("I'm guessing : " + guess);
    }

}
