package pack;

import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {
	public static void main(String[] args) {
		System.out.println("Welcome To Stone Paper Scissors Game");
		System.out.println("User : You can Choose Any One");
		System.out.println("1.Stone\n2.Paper\n3.Scissors");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number := ");
		int user = in.nextInt();
		if (user == 1) {
			System.out.println("Somya choose: Stone");
		}
		if (user == 2) {
			System.out.println("Somya choose: Paper");
		}
		if (user == 3) {
			System.out.println("Somya choose: Scissors");
		}
		int wordNumber;
		if (0 < user && user < 4) {

			Random random = new Random();

			wordNumber = random.nextInt(3) + 1;

			if (1 == wordNumber) {
				System.out.println("Computer choose: Stone");
				if (user == 1) {

					System.out.println("Match Tie!");
				}
				if (user == 2) {
					System.out.println("Somya Win!");
				}
				if (user == 3) {
					System.out.println("Computer Win!");
				}
			}
			if (2 == wordNumber) {
				System.out.println("Computer choose: Paper");
				if (user == 1) {
					System.out.println("Computer Win!");
				}
				if (user == 2) {
					System.out.println("Match Tie!");
				}
				if (user == 3) {
					System.out.println("Somya Win!");
				}
			}
			if (3 == wordNumber) {
				System.out.println("Computer choose: Scissors");
				if (user == 1) {
					System.out.println("Somya Win!");
				}
				if (user == 2) {
					System.out.println("Computer Win!");
				}
				if (user == 3) {
					System.out.println("Match Tie!");
				}
			}
		} else {
			System.out.println("You can Enter valid Number");
		}
	}
}
