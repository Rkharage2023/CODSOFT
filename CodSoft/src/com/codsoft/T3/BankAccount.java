package com.codsoft.T3;

import java.util.Scanner;

public class BankAccount {
	double Balance;

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(double balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [Balance=" + Balance + "]";
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void balanceAccept(Scanner sc) {
		System.out.println("Enter Account Balance:");
		Balance = sc.nextDouble();
		if (Balance < 0) {
			System.out.println("Enter valid balance");
			balanceAccept(sc);
		}
	}

	public void withdraw(Scanner sc) {
		if (Balance > 0) {
			System.out.println("Enter Amount to Withdraw");
			double amt = sc.nextDouble();
			if (amt < 0) {
				System.out.println("Enter valid amount");
				withdraw(sc);
			} else {
				if (amt > 0)
					Balance -= amt;
				System.out.println("Withdraw Successful");
				System.out.println("Bank Balance: " + Balance);
			}
		} else {
			System.out.println("Balance :0");
		}
	}

	public void deposit(Scanner sc) {
		if (Balance <= 5000000) {
			System.out.println("Enter Amount to Deposit (Amt should be < 50000)");
			double amt = sc.nextDouble();
			if (amt < 0) {
				System.out.println("Enter valid amount");
				deposit(sc);
			} else {
				if (amt <= 50000 && amt > 0) {
					Balance += amt;
					if (Balance >= 5000000) {
						System.out.println("You can deposit -" + (5000000 - Balance));
					}

					System.out.println("Deposit Successful");
					System.out.println("Bank Balance: " + Balance);
				} else {

					System.out.println("Amount should be 50000 or less");
				}
			}
		} else {
			System.out.println("Account limit is reached");
		}
	}

	public void checkBalance() {
		System.out.println("Bank Balance: " + Balance);

	}

}
