package com.codsoft.T3;

import java.util.Scanner;

public class ATM extends BankAccount {

	public ATM() {
		// TODO Auto-generated constructor stub
	}

	public ATM(double balance) {
		super(balance);
	}

	@Override
	public String toString() {
		return "Balance=" + Balance;
	}

	public static int menu(Scanner sc) {
		System.out.println("-----------------------------");
		System.out.println("1. Withdraw Money");
		System.out.println("2. Deposit Money");
		System.out.println("3. Check Balance");
		System.out.print("Enter choice:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		if (atm.Balance < 5000000)
			atm.balanceAccept(sc);
		else
			System.out.println("Account limit is reached");

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				atm.withdraw(sc);
				break;

			case 2:
				atm.deposit(sc);
				break;

			case 3:
				atm.checkBalance();

			default:
				break;
			}
		}
	}
}
