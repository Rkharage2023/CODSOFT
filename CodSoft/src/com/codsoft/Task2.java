package com.codsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		List<Integer> mark = new ArrayList<>();

		for (int i = 0; i < 5; i++) { // consider fix 5 subject
			System.out.println("Enter m" + "ark of subject " + (i + 1));
			mark.add(sc.nextInt());
			sum += mark.get(i);
		}
		double avg_per = ((double) sum / 500) * 100;
		String grade = "";
		if (avg_per > 35) {
			if (avg_per >= 95 && avg_per <= 100) {
				grade = "A-Grade";
			} else if (avg_per < 95 && avg_per >= 85) {
				grade = "B-Grade";
			} else if (avg_per < 85 && avg_per >= 75) {
				grade = "C-Grade";
			} else if (avg_per < 75 && avg_per >= 55) {
				grade = "D-Grade";
			} else if (avg_per < 55 && avg_per >= 35) {
				grade = "E-Grade";
			}

		} else {
			grade = "Fail";
		}

		System.out.println("Result -");
		System.out.println("Total Marks :" + sum);
		System.out.println("Average Percentage :" + avg_per + "%");
		System.out.println("Grade :" + grade);
	}

}
