import java.util.*;
public class GuessingGame {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int guess=0;		
		int x=(int)(Math.random()*10);
		while(guess!=x||guess!=-1){
		System.out.print("Please guess an integer between 0 and 10 or enter -1 to exit.");		
		int guess=input.nextInt();			
		if(guess<0||guess>10){
			System.out.print("Guess must be between 0 and 10.");
		}
		else if(guess==x){
			System.out.println("Congratulations! You guessed right!");
		}
		else if(guess>x){
			System.out.print("Sorry, the correct answer was lower than your guess.  Guess again or enter -1 to exit..");
		}
		else if(guess<x){
			System.out.print("Sorry, the correct answer was lower than your guess.  Guess again or enter -1 to exit..");
			
		}
		}
		
			System.out.println("Thank you for playing. Goodbye.");
			System.exit(1);
		}
}

}
