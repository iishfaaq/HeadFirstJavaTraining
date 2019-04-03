package com.Ishfaaq.HeadFirstJava.Guess;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	int player1Guess;
	int player2Guess;
	int player3Guess;
	
	void startGame() {
		 
		 p1= new Player();
		 p2= new Player();
		 p3= new Player();
			
		p1.guess();
		p2.guess();
		p3.guess();
		
		player1Guess = p1.guessNumber;
		player2Guess = p2.guessNumber;
		player3Guess = p3.guessNumber;
			
			
		int GameNumber = (int) (Math.random()*10);
		
		System.out.println("The games's guessed value is " +GameNumber );
		
		
		boolean resultsP1 = (GameNumber == player1Guess);
		boolean resultsP2 = (GameNumber == player2Guess);
		boolean resultsP3 = (GameNumber == player3Guess);
		
		if(resultsP1 || resultsP2 || resultsP3) {
			System.out.println("A player has won the game");
			System.out.println("Player 1 got it right? = "+ resultsP1 );
			System.out.println("Player 2 got it right? = "+ resultsP2 );
			System.out.println("Player 3 got it right? = "+ resultsP3 );
		}
		
		else {
			System.out.println("No one won the game. Try Again");
		}
	}
	
	

}
