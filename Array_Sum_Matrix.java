package pack;

import java.util.Scanner;

public class Array_Sum_Matrix {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first matrix");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}

		}
		int[][] arr1 = new int[3][3];
		// Scanner in=new Scanner(System.in);
		System.out.println("Enter Second matrix");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = in.nextInt();
			}

		}
		System.out.println("Sum of matrix");
		int[][] arr2 = new int[3][3];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr1[i][j] = arr[i][j] + arr1[i][j];
			}

		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {

				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
