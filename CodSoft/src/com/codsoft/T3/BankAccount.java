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
	}

}
