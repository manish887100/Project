package pack;

import java.util.Random;
import java.util.Scanner;

public class Otp_Generator {
	public static void main(String[] args) {
		System.out.print("Enter a Mobile Number : ");
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		System.out.println("Your Mobile Number is :" + num);
		int len = 4;
		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random random = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		System.out.print("Your OTP is : ");
		for (int i = 0; i < len; i++) {

		}
		System.out.println(otp);
	}
}
