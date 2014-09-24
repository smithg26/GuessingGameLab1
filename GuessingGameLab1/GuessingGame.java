import java.util.*;
public class GuessingGame {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int x=(int)(Math.random()*10);
		System.out.print("Please guess an integer between 0 and 10");
		int guess=input.nextInt();
		if(guess<0||guess>10){
			System.out.print("Entry must be between 0 and 10.  You failed.");
		}
		else if(guess==x){
			System.out.println("Congratulations! You guessed right!");
		}
		else{
			System.out.println("Sorry, the correct answer was "+x+".  Goodbye.");
		}
			
	}

}
