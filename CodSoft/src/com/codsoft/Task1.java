package com.codsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	private static int menu(Scanner sc) {
		System.out.println("--NUMBER GAME--");
		System.out.println("1. Play");
		System.out.println("2. Score");
		System.out.println("0. Exit");
		System.out.println("Enter choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		System.out.println("Welcome to Number Game!");
		int choice = 1;
		List<Integer> attempt = new ArrayList<>();
		List<Integer> round = new ArrayList<>();
		int rd = 0;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				int randomNo = ra.nextInt(100);
				int chan = 10;
				int no;
				int at = 0;
				System.out.println("Guess No between 1 to 100 --(In 10 chances)");
				do {
					System.out.print("Enter No : ");
					no = sc.nextInt();
					if (randomNo != no) {
						if (chan > 1) {

							if (randomNo < no) {
								System.out.println("Too high!");
							} else {
								System.out.println("Too low!");
							}
							chan--;
							at++;
						} else {
							System.out.println("You loose all attempts");
							System.out.println("Correct no is: " + randomNo);
							break;
						}
					} else {
						System.out.println("Guessing is correct in attemp " + (at + 1));
						attempt.add(at + 1);
						round.add(rd + 1);
					}
				} while (no != randomNo && chan > 0);
				rd++;
				break;

			case 2:
				if (rd == 0) {
					System.out.println("Play Game");
				} else {
					System.out.println("Score :-");
					for (int i = 0; i < round.size(); i++) {
						System.out.println("Round " + " " + round.get(i) + " in attempt :" + attempt.get(i));
					}
				}

				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		System.out.println("Thank You!");
	}

}
