package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How money are you strarting with?");
		int startAmount = in.nextInt();
		System.out.println("What is your win probability for a single play? (number between 0 and 1)");
		double winChance = in.nextDouble();
		System.out.println("How much money would you like to have before leaving?");
		int winLimit = in.nextInt();
		
		
		int current = startAmount;
		while  (current <= winLimit && current > 0)  {
		double x = (double) Math.random(); 
		if (winChance>=x) {
			current++;
		System.out.println("win: " + current);}
		else  {
			current--;
				System.out.println("Lose: " + current);
			}
		}
		
		
			
			
		}
	}

