package com.Ishfaaq.HeadFirstJava.Guess;

public class Player {
	int guessNumber;
	
	 void guess() {
		guessNumber = (int) (Math.random()*10);
		
		System.out.println("I guessed " + guessNumber);
	}

}
